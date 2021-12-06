package com.lagou.domain;

/**
 * 相应结果封装对象
 */
public class ResponseResult {
    private Boolean success;
    private Integer state;
    private String string;
    private Object content;

    public ResponseResult() {
    }

    public ResponseResult(Boolean success, Integer state, String string, Object content) {
        this.success = success;
        this.state = state;
        this.string = string;
        this.content = content;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
