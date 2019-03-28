package com.lyf.model;

public class TypeJobintension {
    private Integer typeid;

    private String typename;

    private Integer typescore;

    private Integer jid;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypescore() {
        return typescore;
    }

    public void setTypescore(Integer typescore) {
        this.typescore = typescore;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}