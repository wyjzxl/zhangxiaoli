package cn.itrip.biz.service;

import cn.itrip.beans.dto.Dto;
import cn.itrip.biz.vo.LinkUserVo;

public interface UserInfoSerivce {
    Dto queryuserlinkuser(String linkUserName);
    Dto adduserlinkuser(LinkUserVo linkUserVo);
    Dto deluserlinkuser(Integer ids);
    Dto modifyuserlinkuser(LinkUserVo linkUserVo);
}
