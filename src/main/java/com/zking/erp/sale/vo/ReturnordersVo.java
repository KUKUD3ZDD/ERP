package com.zking.erp.sale.vo;

import com.zking.erp.sale.model.Returnorders;

public class ReturnordersVo extends Returnorders {

    private String suname;

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public ReturnordersVo() {
    }

    @Override
    public String toString() {
        return "ReturnordersVo{" +
                "suname='" + suname + '\'' +
                '}';
    }
}
