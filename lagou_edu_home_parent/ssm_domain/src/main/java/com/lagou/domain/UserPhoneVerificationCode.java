package com.lagou.domain;


import java.util.Date;

public class UserPhoneVerificationCode {

  private int id;
  private String phone;
  private String verificationCode;
  private Date createTime;
  private String isCheck;
  private int checkTimes;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public String getIsCheck() {
    return isCheck;
  }

  public void setIsCheck(String isCheck) {
    this.isCheck = isCheck;
  }


  public int getCheckTimes() {
    return checkTimes;
  }

  public void setCheckTimes(int checkTimes) {
    this.checkTimes = checkTimes;
  }

}
