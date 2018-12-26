package com.zking.erp.repertory.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ToString
public class Storeoper extends BaseEntity{
    private Integer stoid;

    private String empname;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date opertime;

    private String storename;

    private String goodsname;

    private Integer num;

    private String type;

    public Storeoper(Integer stoid, String empname, Date opertime, String storename, String goodsname, Integer num, String type) {
        this.stoid = stoid;
        this.empname = empname;
        this.opertime = opertime;
        this.storename = storename;
        this.goodsname = goodsname;
        this.num = num;
        this.type = type;
    }

    public Storeoper() {
        super();
    }

    public Integer getStoid() {
        return stoid;
    }

    public void setStoid(Integer stoid) {
        this.stoid = stoid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}