package com.zking.erp.basic.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

@ToString
public class Supplier extends BaseEntity{
    private Integer suid;

    private String suname;

    private String suaddress;

    private String sucontact;

    private String sutel;

    private String suemail;

    private String sutype;

    public Supplier(Integer suid, String suname, String suaddress, String sucontact, String sutel, String suemail, String sutype) {
        this.suid = suid;
        this.suname = suname;
        this.suaddress = suaddress;
        this.sucontact = sucontact;
        this.sutel = sutel;
        this.suemail = suemail;
        this.sutype = sutype;
    }

    public Supplier() {
        super();
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public String getSuaddress() {
        return suaddress;
    }

    public void setSuaddress(String suaddress) {
        this.suaddress = suaddress;
    }

    public String getSucontact() {
        return sucontact;
    }

    public void setSucontact(String sucontact) {
        this.sucontact = sucontact;
    }

    public String getSutel() {
        return sutel;
    }

    public void setSutel(String sutel) {
        this.sutel = sutel;
    }

    public String getSuemail() {
        return suemail;
    }

    public void setSuemail(String suemail) {
        this.suemail = suemail;
    }

    public String getSutype() {
        return sutype;
    }

    public void setSutype(String sutype) {
        this.sutype = sutype;
    }
}