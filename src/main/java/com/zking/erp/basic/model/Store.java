package com.zking.erp.basic.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

@ToString
public class Store extends BaseEntity {
    private Integer sid;

    private String sname;

    private Integer empuuid;

    private String address;

    public Store(Integer sid, String sname, Integer empuuid, String address) {
        this.sid = sid;
        this.sname = sname;
        this.empuuid = empuuid;
        this.address = address;
    }

    public Store() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getEmpuuid() {
        return empuuid;
    }

    public void setEmpuuid(Integer empuuid) {
        this.empuuid = empuuid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}