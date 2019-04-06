package cn.itrip.beans.vo;

import lombok.Data;

@Data
public class ItripToken {
    private Long expTime;
    private Long genTime;
    private String token;
}
