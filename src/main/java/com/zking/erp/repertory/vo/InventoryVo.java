package com.zking.erp.repertory.vo;

import com.zking.erp.repertory.model.Inventory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InventoryVo extends Inventory {
    private String gname;
    private String sname;

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

    public InventoryVo() {
    }

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        System.out.println(date );// new Date()为获取当前系统时间
    }
}
