package cn.itrip.biz.service.Impl;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.UserLinkUser;
import cn.itrip.biz.service.UserInfoSerivce;
import cn.itrip.biz.vo.LinkUserVo;
import cn.itrip.mapper.UserLinkUserMapper;
import cn.itrip.util.DtoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoSerivce {
    @Resource
    private UserLinkUserMapper userLinkUserMapper;
    @Override
    public Dto queryuserlinkuser(String linkUserName) {
        UserLinkUser userLinkUser = new UserLinkUser();
        userLinkUser.setLinkUserName(linkUserName);
        List<UserLinkUser> list = userLinkUserMapper.select(userLinkUser);
        return DtoUtil.getSuccesWithData(list,"获取成功");

    }

    @Override
    public Dto adduserlinkuser(LinkUserVo linkUserVo) {
        UserLinkUser userLinkUser = new UserLinkUser();
        userLinkUser.setLinkIdCard(linkUserVo.getLinkIdCard());
        userLinkUser.setLinkUserName(linkUserVo.getLinkUserName());
        userLinkUser.setLinkPhone(linkUserVo.getLinkPhone());
        userLinkUser.setLinkidCardType(0);
        userLinkUserMapper.insert(userLinkUser);
        return DtoUtil.getSuccessDto("添加常用联系人成功!");
    }

    @Override
    public Dto deluserlinkuser(Integer ids) {

        userLinkUserMapper.deleteByPrimaryKey(ids);
        return DtoUtil.getSuccessDto("删除成功!");
    }

    @Override
    public Dto modifyuserlinkuser(LinkUserVo linkUserVo) {
        UserLinkUser userLinkUser=new UserLinkUser();
        userLinkUser.setLinkUserName(linkUserVo.getLinkUserName());
        userLinkUser.setLinkIdCard(linkUserVo.getLinkIdCard());
        userLinkUser.setId(linkUserVo.getId());
        userLinkUser.setLinkidCardType(linkUserVo.getLinkIdCardType());
        userLinkUser.setLinkPhone(linkUserVo.getLinkPhone());
        userLinkUserMapper.updateByPrimaryKey(userLinkUser);
        return DtoUtil.getSuccessDto("修改成功!");
    }
}
