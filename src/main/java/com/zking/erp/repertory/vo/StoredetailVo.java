package com.zking.erp.repertory.vo;

import com.zking.erp.repertory.model.Storedetail;

public class StoredetailVo extends Storedetail {
    private String gname;   //商品名称
    private String sname;   //仓库名称

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public StoredetailVo() {
    }
}
