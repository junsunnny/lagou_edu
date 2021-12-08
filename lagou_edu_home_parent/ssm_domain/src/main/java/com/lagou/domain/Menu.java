package com.lagou.domain;


import java.util.Date;
import java.util.List;

public class Menu {

  private int id;
  private int parentId;
  private String href;
  private String icon;
  private String name;
  private String description;
  private int orderNum;
  private int shown;
  private int level;
  private Date createdTime;
  private Date updatedTime;
  private String createdBy;
  private String updatedBy;

  // 用来查询自连接的对象封装 里面是子级菜单
  private List<Menu> subMenuList;

  public List<Menu> getSubMenuList() {
    return subMenuList;
  }

  public void setSubMenuList(List<Menu> subMenuList) {
    this.subMenuList = subMenuList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getParentId() {
    return parentId;
  }

  public void setParentId(int parentId) {
    this.parentId = parentId;
  }


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public int getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(int orderNum) {
    this.orderNum = orderNum;
  }


  public int getShown() {
    return shown;
  }

  public void setShown(int shown) {
    this.shown = shown;
  }


  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }


  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }


  public Date getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Date updatedTime) {
    this.updatedTime = updatedTime;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

}
