package com.lagou.domain;


public class CourseMedia {

  private int id;
  private int courseId;
  private int sectionId;
  private int lessonId;
  private String coverImageUrl;
  private String duration;
  private String fileEdk;
  private double fileSize;
  private String fileName;
  private String fileDk;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private int isDel;
  private int durationNum;
  private String fileId;


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


  public int getLessonId() {
    return lessonId;
  }

  public void setLessonId(int lessonId) {
    this.lessonId = lessonId;
  }


  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public String getFileEdk() {
    return fileEdk;
  }

  public void setFileEdk(String fileEdk) {
    this.fileEdk = fileEdk;
  }


  public double getFileSize() {
    return fileSize;
  }

  public void setFileSize(double fileSize) {
    this.fileSize = fileSize;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public String getFileDk() {
    return fileDk;
  }

  public void setFileDk(String fileDk) {
    this.fileDk = fileDk;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public int getIsDel() {
    return isDel;
  }

  public void setIsDel(int isDel) {
    this.isDel = isDel;
  }


  public int getDurationNum() {
    return durationNum;
  }

  public void setDurationNum(int durationNum) {
    this.durationNum = durationNum;
  }


  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

}
