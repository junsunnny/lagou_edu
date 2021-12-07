package com.lagou.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserVO {

    // 当前页码
    private Integer currentPage;

    // 每页显示条数
    private Integer pageSize;

    // 用户名
    private String userName;

    // 开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startCreateTime;

    // 结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endCreateTime;


    @Override
    public String toString() {
        return "UserVO{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", userName='" + userName + '\'' +
                ", startCreateTime=" + startCreateTime +
                ", endCreateTime=" + endCreateTime +
                '}';
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Date startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public Date getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Date endCreateTime) {
        this.endCreateTime = endCreateTime;
    }
}
