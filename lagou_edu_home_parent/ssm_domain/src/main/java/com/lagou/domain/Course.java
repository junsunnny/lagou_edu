package com.lagou.domain;


import java.util.Date;
import java.util.List;

public class Course {

  private int id;
  private String courseName;
  private String brief;
  private double price;
  private String priceTag;
  private double discounts;
  private String discountsTag;
  private String courseDescriptionMarkDown;
  private String courseDescription;
  private String courseImgUrl;
  private int isNew;
  private String isNewDes;
  private int lastOperatorId;
  private Date autoOnlineTime;
  private Date createTime;
  private Date updateTime;
  private int isDel;
  private int totalDuration;
  private String courseListImg;
  private int status;
  private int sortNum;
  private String previewFirstField;
  private String previewSecondField;
  private int sales;

  /**
   * 在课程表中添加section
   */
  private List<CourseSection> sectionList;

  @Override
  public String toString() {
    return "Course{" +
            "id=" + id +
            ", courseName='" + courseName + '\'' +
            ", brief='" + brief + '\'' +
            ", price=" + price +
            ", priceTag='" + priceTag + '\'' +
            ", discounts=" + discounts +
            ", discountsTag='" + discountsTag + '\'' +
            ", courseDescriptionMarkDown='" + courseDescriptionMarkDown + '\'' +
            ", courseDescription='" + courseDescription + '\'' +
            ", courseImgUrl='" + courseImgUrl + '\'' +
            ", isNew=" + isNew +
            ", isNewDes='" + isNewDes + '\'' +
            ", lastOperatorId=" + lastOperatorId +
            ", autoOnlineTime=" + autoOnlineTime +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDel=" + isDel +
            ", totalDuration=" + totalDuration +
            ", courseListImg='" + courseListImg + '\'' +
            ", status=" + status +
            ", sortNum=" + sortNum +
            ", previewFirstField='" + previewFirstField + '\'' +
            ", previewSecondField='" + previewSecondField + '\'' +
            ", sales=" + sales +
            ", sectionList=" + sectionList +
            '}';
  }

  public List<CourseSection> getSectionList() {
    return sectionList;
  }

  public void setSectionList(List<CourseSection> sectionList) {
    this.sectionList = sectionList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getPriceTag() {
    return priceTag;
  }

  public void setPriceTag(String priceTag) {
    this.priceTag = priceTag;
  }

  public double getDiscounts() {
    return discounts;
  }

  public void setDiscounts(double discounts) {
    this.discounts = discounts;
  }

  public String getDiscountsTag() {
    return discountsTag;
  }

  public void setDiscountsTag(String discountsTag) {
    this.discountsTag = discountsTag;
  }

  public String getCourseDescriptionMarkDown() {
    return courseDescriptionMarkDown;
  }

  public void setCourseDescriptionMarkDown(String courseDescriptionMarkDown) {
    this.courseDescriptionMarkDown = courseDescriptionMarkDown;
  }

  public String getCourseDescription() {
    return courseDescription;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }

  public String getCourseImgUrl() {
    return courseImgUrl;
  }

  public void setCourseImgUrl(String courseImgUrl) {
    this.courseImgUrl = courseImgUrl;
  }

  public int getIsNew() {
    return isNew;
  }

  public void setIsNew(int isNew) {
    this.isNew = isNew;
  }

  public String getIsNewDes() {
    return isNewDes;
  }

  public void setIsNewDes(String isNewDes) {
    this.isNewDes = isNewDes;
  }

  public int getLastOperatorId() {
    return lastOperatorId;
  }

  public void setLastOperatorId(int lastOperatorId) {
    this.lastOperatorId = lastOperatorId;
  }

  public Date getAutoOnlineTime() {
    return autoOnlineTime;
  }

  public void setAutoOnlineTime(Date autoOnlineTime) {
    this.autoOnlineTime = autoOnlineTime;
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

  public int getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(int totalDuration) {
    this.totalDuration = totalDuration;
  }

  public String getCourseListImg() {
    return courseListImg;
  }

  public void setCourseListImg(String courseListImg) {
    this.courseListImg = courseListImg;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getSortNum() {
    return sortNum;
  }

  public void setSortNum(int sortNum) {
    this.sortNum = sortNum;
  }

  public String getPreviewFirstField() {
    return previewFirstField;
  }

  public void setPreviewFirstField(String previewFirstField) {
    this.previewFirstField = previewFirstField;
  }

  public String getPreviewSecondField() {
    return previewSecondField;
  }

  public void setPreviewSecondField(String previewSecondField) {
    this.previewSecondField = previewSecondField;
  }

  public int getSales() {
    return sales;
  }

  public void setSales(int sales) {
    this.sales = sales;
  }
}
