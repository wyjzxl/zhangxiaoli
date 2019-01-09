package cn.com.guimei.pojo;


import java.util.Date;

public class Customer {

  private long id;
  private String cusName;
  private String cusLoginName;
  private String cusPassword;
  private String cusEmail;
  private String cusSex;
  private String cusPhoto;
  private String cusHobby;
  private String cusCode;
  private Date cusBirthday;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCusName() {
    return cusName;
  }

  public void setCusName(String cusName) {
    this.cusName = cusName;
  }


  public String getCusLoginName() {
    return cusLoginName;
  }

  public void setCusLoginName(String cusLoginName) {
    this.cusLoginName = cusLoginName;
  }


  public String getCusPassword() {
    return cusPassword;
  }

  public void setCusPassword(String cusPassword) {
    this.cusPassword = cusPassword;
  }


  public String getCusEmail() {
    return cusEmail;
  }

  public void setCusEmail(String cusEmail) {
    this.cusEmail = cusEmail;
  }


  public String getCusSex() {
    return cusSex;
  }

  public void setCusSex(String cusSex) {
    this.cusSex = cusSex;
  }


  public String getCusPhoto() {
    return cusPhoto;
  }

  public void setCusPhoto(String cusPhoto) {
    this.cusPhoto = cusPhoto;
  }


  public String getCusHobby() {
    return cusHobby;
  }

  public void setCusHobby(String cusHobby) {
    this.cusHobby = cusHobby;
  }


  public String getCusCode() {
    return cusCode;
  }

  public void setCusCode(String cusCode) {
    this.cusCode = cusCode;
  }


  public Date getCusBirthday() {
    return cusBirthday;
  }

  public void setCusBirthday(Date cusBirthday) {
    this.cusBirthday = cusBirthday;
  }

}
