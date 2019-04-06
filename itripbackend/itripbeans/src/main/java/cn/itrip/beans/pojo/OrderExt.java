package cn.itrip.beans.pojo;

import lombok.Data;

import java.util.List;

@Data
public class OrderExt extends Order {
    List<UserLinkUser> linkUser;
}
