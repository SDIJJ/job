package com.lyf.model;

public class Workexppeopleintension {
    private Integer workexpid;

    private String workexp;

    private Integer placescore;

    private Integer pid;

    public Integer getWorkexpid() {
        return workexpid;
    }

    public void setWorkexpid(Integer workexpid) {
        this.workexpid = workexpid;
    }

    public String getWorkexp() {
        return workexp;
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp == null ? null : workexp.trim();
    }

    public Integer getPlacescore() {
        return placescore;
    }

    public void setPlacescore(Integer placescore) {
        this.placescore = placescore;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}