package com.lagou.domain;


import java.util.Date;
import java.util.List;

public class CourseLesson {

  private int id;
  private int courseId;
  private int sectionId;
  private String theme;
  private int duration;
  private int isFree;
  private Date createTime;
  private Date updateTime;
  private int isDel;
  private int orderNum;
  private int status;

  // 对应的章节信息
  private CourseSection courseSection;

  public CourseSection getCourseSection() {
    return courseSection;
  }

  public void setCourseSection(CourseSection courseSection) {
    this.courseSection = courseSection;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getCourseId() {
    return courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }


  public int getSectionId() {
    return sectionId;
  }

  public void setSectionId(int sectionId) {
    this.sectionId = sectionId;
  }


  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }


  public int getIsFree() {
    return isFree;
  }

  public void setIsFree(int isFree) {
    this.isFree = isFree;
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


  public int getIsDel() {
    return isDel;
  }

  public void setIsDel(int isDel) {
    this.isDel = isDel;
  }


  public int getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(int orderNum) {
    this.orderNum = orderNum;
  }


  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

}
