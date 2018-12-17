package com.zking.erp.sys.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

import java.util.Date;
@ToString
public class Emp extends BaseEntity{
    private Integer iid;

    private String username;

    private String pwd;

    private String salt;

    private String name;

    private String gender;

    private String email;

    private String etel;

    private String address;

    private Date birthday;

    private Integer depuuid;

    public Emp(Integer iid, String username, String pwd, String salt, String name, String gender, String email, String etel, String address, Date birthday, Integer depuuid) {
        this.iid = iid;
        this.username = username;
        this.pwd = pwd;
        this.salt = salt;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.etel = etel;
        this.address = address;
        this.birthday = birthday;
        this.depuuid = depuuid;
    }

    public Emp() {
        super();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getDepuuid() {
        return depuuid;
    }

    public void setDepuuid(Integer depuuid) {
        this.depuuid = depuuid;
    }
}