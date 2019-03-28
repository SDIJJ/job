package com.lyf.model;

public class Placejobintension {
    private Integer placeid;

    private String placename;

    private Integer placescore;

    private Integer jid;

    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename == null ? null : placename.trim();
    }

    public Integer getPlacescore() {
        return placescore;
    }

    public void setPlacescore(Integer placescore) {
        this.placescore = placescore;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}