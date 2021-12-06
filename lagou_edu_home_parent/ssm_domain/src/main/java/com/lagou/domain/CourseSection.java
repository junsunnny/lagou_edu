package com.lagou.domain;

import java.util.Date;
import java.util.List;

public class CourseSection {

  private int id;
  private int courseId;
  private String sectionName;
  private String description;
  private Date createTime;
  private Date updateTime;
  private int isDe;
  private int orderNum;
  private int status;

  // 描述对应的课程信息
  private Course course;

  // 描述对应的章节信息
  private List<CourseLesson> lessonList;

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public List<CourseLesson> getLessonList() {
    return lessonList;
  }

  public void setLessonList(List<CourseLesson> lessonList) {
    this.lessonList = lessonList;
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


  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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


  public int getIsDe() {
    return isDe;
  }

  public void setIsDe(int isDe) {
    this.isDe = isDe;
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
