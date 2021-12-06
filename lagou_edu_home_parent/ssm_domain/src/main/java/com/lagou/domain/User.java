package com.lagou.domain;


import java.util.Date;

public class User {

  private int id;
  private String name;
  private String portrait;
  private String phone;
  private String password;
  private String regIp;
  private String accountNonExpired;
  private String credentialsNonExpired;
  private String accountNonLocked;
  private String status;
  private String isDel;
  private Date createTime;
  private Date updateTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getRegIp() {
    return regIp;
  }

  public void setRegIp(String regIp) {
    this.regIp = regIp;
  }


  public String getAccountNonExpired() {
    return accountNonExpired;
  }

  public void setAccountNonExpired(String accountNonExpired) {
    this.accountNonExpired = accountNonExpired;
  }


  public String getCredentialsNonExpired() {
    return credentialsNonExpired;
  }

  public void setCredentialsNonExpired(String credentialsNonExpired) {
    this.credentialsNonExpired = credentialsNonExpired;
  }


  public String getAccountNonLocked() {
    return accountNonLocked;
  }

  public void setAccountNonLocked(String accountNonLocked) {
    this.accountNonLocked = accountNonLocked;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getIsDel() {
    return isDel;
  }

  public void setIsDel(String isDel) {
    this.isDel = isDel;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

}
