package cn.itrip.auth.service;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.User;
import cn.itrip.beans.vo.ItripToken;

public interface UserService {
    /**
     * 邮箱注册
     * @param user
     * @return
     */
    Dto register(User user);

    /**
     *验证邮箱是否存在
     * @param name
     * @return
     */
    Dto isExists(String name);

    /**
     * 手机号码注册
     * @param user
     * @return
     */
    Dto registerbyphone(User user);

    /**
     * 手机号码激活账户
     * @param user
     * @param code
     * @return
     */
    Dto validatephone(String user,String code);
    /**
     * 邮箱激活
     * @param userCode
     * @param activateCode
     * @return
     */
    Dto activate(String userCode,String activateCode);

    /**
     * 登陆
     * @param userCode
     * @param userPassword
     * @param fromType
     * @return
     */
    Dto<ItripToken> dologin(String userCode, String userPassword,String fromType);

    /**
     * 注销
     * @param token
     * @return
     */
    Dto logout(String token);

    /**
     * 置换token
     * @param token
     * @return
     */
    Dto<ItripToken> retoken(String token);
}
