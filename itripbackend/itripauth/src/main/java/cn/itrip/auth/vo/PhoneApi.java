package cn.itrip.auth.vo;

import com.cloopen.rest.sdk.CCPRestSmsSDK;


public class PhoneApi extends CCPRestSmsSDK {
    public PhoneApi(String serverIp,String serverPort,String accountid,String token,String appid) {
        super.init(serverIp,serverPort);
        super.setAccount(accountid,token);
        super.setAppId(appid);
    }
}
