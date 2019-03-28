package com.lyf.model;

import java.util.List;
import java.util.Set;

public class Resume {
    private Integer rid;

    private String position;

    private String name;

    private Integer age;

    private String sex;

    private String email;

    private String address;

    private String phone;

    private String huji;

    private String xueli;

    private String school;

    private String major;

    private Integer majorpm;

    private String certificate;

    private String level;

    private String workexp;

    private String ppath;

    private String rpath;

    private Integer uid;

    private String username;

    private String role;


    private List<Company> companies;

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHuji() {
        return huji;
    }

    public void setHuji(String huji) {
        this.huji = huji == null ? null : huji.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getMajorpm() {
        return majorpm;
    }

    public void setMajorpm(Integer majorpm) {
        this.majorpm = majorpm;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getWorkexp() {
        return workexp;
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp == null ? null : workexp.trim();
    }

    public String getPpath() {
        return ppath;
    }

    public void setPpath(String ppath) {
        this.ppath = ppath == null ? null : ppath.trim();
    }

    public String getRpath() {
        return rpath;
    }

    public void setRpath(String rpath) {
        this.rpath = rpath == null ? null : rpath.trim();
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "rid=" + rid +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", huji='" + huji + '\'' +
                ", xueli='" + xueli + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", majorpm=" + majorpm +
                ", certificate='" + certificate + '\'' +
                ", level='" + level + '\'' +
                ", workexp='" + workexp + '\'' +
                ", ppath='" + ppath + '\'' +
                ", rpath='" + rpath + '\'' +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", companies=" + companies +
                '}';
    }
}