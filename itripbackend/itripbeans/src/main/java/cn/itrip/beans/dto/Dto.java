package cn.itrip.beans.dto;

import lombok.Data;

@Data
public class Dto<T> {
    private String errorCode;
    private String msg;
    private String success;
    private T Data;
}
