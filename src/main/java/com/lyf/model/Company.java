package com.lyf.model;

import java.util.List;
import java.util.Set;

public class Company {
    private Integer cid;

    private String cname;

    private String typename;

    private String cintroduce;

    private String cphotopath;

    private String position;

    private String place;

    private String skillneed;

    private String others;

    private Integer uid;

    private String username;
    //此处添加了一个公司和简历的多对多关系
    private List<Resume> resumes;

    public List<Resume> getResumes() {
        return resumes;
    }

    public void setResumes(List<Resume> resumes) {
        this.resumes = resumes;
    }
    //    private Integer score;
//
//    public Integer getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getCintroduce() {
        return cintroduce;
    }

    public void setCintroduce(String cintroduce) {
        this.cintroduce = cintroduce == null ? null : cintroduce.trim();
    }

    public String getCphotopath() {
        return cphotopath;
    }

    public void setCphotopath(String cphotopath) {
        this.cphotopath = cphotopath == null ? null : cphotopath.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getSkillneed() {
        return skillneed;
    }

    public void setSkillneed(String skillneed) {
        this.skillneed = skillneed == null ? null : skillneed.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();

    }

    @Override
    public String toString() {
        return "Company{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", typename='" + typename + '\'' +
                ", cintroduce='" + cintroduce + '\'' +
                ", cphotopath='" + cphotopath + '\'' +
                ", position='" + position + '\'' +
                ", place='" + place + '\'' +
                ", skillneed='" + skillneed + '\'' +
                ", others='" + others + '\'' +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", resumes=" + resumes +
                '}';
    }
}