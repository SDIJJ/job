package com.lyf.model;

public class Xuelipeopleintension {
    private Integer xueliid;

    private String xueliname;

    private Integer xueliscore;

    private Integer pid;

    public Integer getXueliid() {
        return xueliid;
    }

    public void setXueliid(Integer xueliid) {
        this.xueliid = xueliid;
    }

    public String getXueliname() {
        return xueliname;
    }

    public void setXueliname(String xueliname) {
        this.xueliname = xueliname == null ? null : xueliname.trim();
    }

    public Integer getXueliscore() {
        return xueliscore;
    }

    public void setXueliscore(Integer xueliscore) {
        this.xueliscore = xueliscore;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}