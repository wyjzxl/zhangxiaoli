package cn.itrip.auth.service.Impl;

import cn.itrip.auth.service.UserService;
import cn.itrip.auth.vo.PhoneApi;
import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.User;
import cn.itrip.beans.vo.ItripToken;
import cn.itrip.mapper.UserMapper;
import cn.itrip.util.DtoUtil;
import cn.itrip.util.Md5Utils;
import cn.itrip.util.UUIDUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private JavaMailSender javaMailSender;
    @Resource
    private SimpleMailMessage simpleMailMessage;
    @Resource
    private PhoneApi phoneApi;

    /**
     * 邮箱注册
     * @param user
     * @return
     */
    @Override
    public Dto register(User user) {
        boolean flag=isExistss(user.getUserCode());
        if(flag){
            user.setActivated(0);
            user.setCreationDate(new Date());
            user.setModifyDate(new Date());
            if (!(userMapper.insert(user) > 0)) {
                return DtoUtil.getFalseDto("添加失败,请联系管理员", "10001");
            }
            String code = UUID.randomUUID().toString();
            stringRedisTemplate.opsForValue().set(user.getUserCode(), code, 1 * 60 * 24, TimeUnit.MINUTES);
            simpleMailMessage.setText("欢迎注册我们网站,您的验证码是" + code + "一天内有效，尽快激活");
            simpleMailMessage.setTo(user.getUserCode());

            javaMailSender.send(simpleMailMessage);
            return DtoUtil.getSuccessDto("消息发送成功");
        }
        return DtoUtil.getFalseDto("用户已经存在","10008");

    }
    public boolean isExistss(String name) {
        User user = new User();
        user.setUserCode(name);
        System.out.println(userMapper.selectCount(user));
        boolean b = userMapper.selectCount(user) == 0;
        if (!b) {
            return false;
        }
        return true;
    }
    /**
     * 验证邮箱是否存在
     *
     * @param name
     * @return
     */
    @Override
    public Dto isExists(String name) {
        User user = new User();
        user.setUserCode(name);
        System.out.println(userMapper.selectCount(user));
        boolean b = userMapper.selectCount(user) == 0;
        if (!b) {
            return DtoUtil.getFalseDto("已经存在此用户了", "10003");
        }
        return DtoUtil.getSuccessDto("可以注册");
    }

    /**
     * 手机注册
     * @param user
     * @return
     */
    @Override
    public Dto registerbyphone(User user) {
        boolean flag=isExistss(user.getUserCode());
        if(flag){
            user.setActivated(0);
            user.setCreationDate(new Date());
            user.setModifyDate(new Date());
            if (!(userMapper.insert(user) > 0)) {
                return DtoUtil.getFalseDto("添加失败，联系管理员", "10001");
            }
            Random random = new Random();
            String code = random.nextInt(10) + "" + random.nextInt(10) + "" + random.nextInt(10) + "" + random.nextInt(10);
            stringRedisTemplate.opsForValue().set(user.getUserCode(), code, 1, TimeUnit.MINUTES);
            phoneApi.sendTemplateSMS(user.getUserCode(), "1", new String[]{code, 1 + ""});
            return DtoUtil.getSuccessDto("消息发送成功!");
        }

        return DtoUtil.getFalseDto("用户已经存在","10001");
    }

    /**
     * 手机号码激活
     * @param user
     * @param code
     * @return
     */
    @Override
    public Dto validatephone(String user, String code) {

        if(!stringRedisTemplate.hasKey(user)){
            return DtoUtil.getFalseDto("用户不存在或者已经激活","10004");
        }
        if(StringUtils.isEmpty(code)){
            return DtoUtil.getFalseDto("验证码不为空","10005");
        }
        if (!stringRedisTemplate.opsForValue().get(user).equals(code)) {
            return DtoUtil.getFalseDto("验证码不匹配","10006");
        }
        User user2=new User();
        user2.setUserCode(user);
        user2=userMapper.selectOne(user2);
        if(!ObjectUtils.isEmpty(user2)){
            user2.setActivated(1);
            userMapper.updateByPrimaryKey(user2);
            //4  删除掉redis 的code
            stringRedisTemplate.delete(user);
            return DtoUtil.getSuccessDto("激活成功");
        }
        return DtoUtil.getFalseDto("激活失败!","10015");
    }

    /**
     * 手机号码或者邮箱激活
     * @param userCode
     * @param activateCode
     * @return
     */
    @Override
    public Dto activate(String userCode, String activateCode) {
        if(!stringRedisTemplate.hasKey(userCode)){
            return DtoUtil.getFalseDto("用户不存在或者已经激活","10004");
        }
        if(StringUtils.isEmpty(activateCode)){
            return DtoUtil.getFalseDto("验证码不为空","10005");
        }
        if (!stringRedisTemplate.opsForValue().get(userCode).equals(activateCode)) {
            return DtoUtil.getFalseDto("验证码不匹配","10006");
        }
        User user2=new User();
        user2.setUserCode(userCode);
        user2=userMapper.selectOne(user2);
        user2.setActivated(1);
        //3  修改用户的状态为激活
        userMapper.updateByPrimaryKey(user2);
        //4  删除掉redis 的code
        stringRedisTemplate.delete(userCode);
        return DtoUtil.getSuccessDto("激活成功");
    }

    @Override
    public Dto<ItripToken> dologin(String userCode, String userPassword, String fromType) {
        if("".equals(userCode) || "".equals(userPassword) || userCode==null || userPassword==null){
            return DtoUtil.getFalseDto("用户或者密码不能为空","10009");
        }

        User user2 = new User();
        user2.setUserCode(userCode);
        boolean c = userMapper.selectCount(user2) == 0;
        if(c){
            return DtoUtil.getFalseDto("用户不存在", "10010");
        }


        User user=new User();
        user.setUserCode(userCode);
        user.setUserPassword(userPassword);
        user=userMapper.selectOne(user);
        if(!userPassword.equals(user.getUserPassword())){
            return DtoUtil.getFalseDto("用户密码不匹配","10007");
        }
        if(user.getActivated()==0){
            return DtoUtil.getFalseDto("账户没有激活","10008");
        }
        ItripToken itripToken=buildToken(fromType,user);

        return DtoUtil.getSuccesWithData(itripToken,"登录成功");
    }

    /**
     * 注销
     * @param token
     * @return
     */
    @Override
    public Dto logout(String token) {
        if(!stringRedisTemplate.hasKey(token)){
            return DtoUtil.getFalseDto("尚未登陆,注销不了!","10011");
        }
        stringRedisTemplate.delete(token);
        return DtoUtil.getSuccessDto("注销成功");
    }

    /**
     * 置换token
     * @param token
     * @return
     */
    @Override
    public Dto<ItripToken> retoken(String token) {
        if(!stringRedisTemplate.hasKey(token)){
            return DtoUtil.getFalseDto("尚未登录，置换不了token","10012");
        }
        String userJson=stringRedisTemplate.opsForValue().get(token);
        String dateTime= token.substring(token.lastIndexOf("-"));
        long time=getTime(dateTime);
        if(new Date().getTime()-time>30000){
            //return DtoUtil.getFalseDto("离过期还早着呢，别着急换","10013");
        }

        String from="pc";
        if(!token.startsWith("token:pc")){
            from="mobile";
        }
        //1  将老的token的时间 重新计时
        stringRedisTemplate.delete(token);
        stringRedisTemplate.expire(token,2,TimeUnit.MINUTES);
        //2  删除老的，创建新的
        ItripToken itripToken =buildToken(from, JSONObject.parseObject(userJson,User.class));

        return DtoUtil.getSuccesWithData(itripToken,"替换成功!");
    }

    private ItripToken buildToken(String fromType,User user){
        Date date=new Date();
        String token="token:"+fromType+"-"+ Md5Utils.encodeStr(user.getUserCode())+"-"+user.getId()+"-"+getTimeStr(date)+"-"+ UUIDUtil.getStr(6,true);
        int time=30;
        if(!fromType.equals("pc")){
            time=Integer.MAX_VALUE;
        }
        stringRedisTemplate.opsForValue().set(token, JSON.toJSONString(user),time, TimeUnit.MINUTES);

        ItripToken itripToken=new ItripToken();
        itripToken.setToken(token);
        itripToken.setGenTime(date.getTime());
        itripToken.setExpTime(date.getTime()+time*60*1000);
        return itripToken;

    }

    /**
     *
     * @param dateTime
     * @return
     */
    private long getTime(String dateTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            return sdf.parse(dateTime).getTime();
        } catch (ParseException e) {
            //  throw new RuntimeException(e);
            return 0;
        }
    }

    /**
     *
     * @param date
     * @return
     */
    private String getTimeStr( Date date) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(date);
    }

}
