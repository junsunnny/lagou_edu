package com.lagou.domain;


import java.util.Date;

public class UserWeixin {

  private int id;
  private int userId;
  private String unionId;
  private String openId;
  private String nickName;
  private String portrait;
  private String city;
  private int sex;
  private Date createTime;
  private Date updateTime;
  private String isDel;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }


  public String getUnionId() {
    return unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }


  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
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


  public String getIsDel() {
    return isDel;
  }

  public void setIsDel(String isDel) {
    this.isDel = isDel;
  }

}
