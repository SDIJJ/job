package com.lyf.model;

public class Peopleintension {
    private Integer pid;

    private Integer xueliweight;

    private Integer workexpweight;

    private Integer aid;

    private String username;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getXueliweight() {
        return xueliweight;
    }

    public void setXueliweight(Integer xueliweight) {
        this.xueliweight = xueliweight;
    }

    public Integer getWorkexpweight() {
        return workexpweight;
    }

    public void setWorkexpweight(Integer workexpweight) {
        this.workexpweight = workexpweight;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}