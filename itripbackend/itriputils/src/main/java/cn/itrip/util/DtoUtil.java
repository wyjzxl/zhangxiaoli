package cn.itrip.util;

import cn.itrip.beans.dto.Dto;

public class DtoUtil {
    public static Dto getSuccessDto(String message){
        Dto dto=new Dto();
        dto.setSuccess("true");
        dto.setMsg(message);
        dto.setErrorCode("000000");
        return dto;
    }

    public static Dto getFalseDto(String message,String errorcode){
        Dto dto=new Dto();
        dto.setSuccess("false");
        dto.setMsg(message);
        dto.setErrorCode(errorcode);
        return dto;
    }

    public static Dto getExceptionDto(String message,String errorcode){
        Dto dto=new Dto();
        dto.setSuccess("false");
        dto.setMsg(message);
        dto.setErrorCode(errorcode);
        return dto;
    }

    public static Dto getSuccesWithData(Object data,String massage){
        Dto dto=new Dto();
        dto.setSuccess("true");
        dto.setMsg("发送成功");
        dto.setErrorCode("000000");
        dto.setData(data);
        return dto;
    }
}
