package com.lyf.model;

public class Jobintension {
    private Integer jid;

    private Integer typeweight;

    private Integer placeweight;

    private Integer aid;

    private String username;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getTypeweight() {
        return typeweight;
    }

    public void setTypeweight(Integer typeweight) {
        this.typeweight = typeweight;
    }

    public Integer getPlaceweight() {
        return placeweight;
    }

    public void setPlaceweight(Integer placeweight) {
        this.placeweight = placeweight;
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