package com.zking.erp.sale.model;

public class Goods {
    private Integer gid;

    private String gname;

    private String origin;

    private String producer;

    private String unit;

    private Float inprice;

    private Float outprice;

    private Integer goodstypeid;

    public Goods(Integer gid, String gname, String origin, String producer, String unit, Float inprice, Float outprice, Integer goodstypeid) {
        this.gid = gid;
        this.gname = gname;
        this.origin = origin;
        this.producer = producer;
        this.unit = unit;
        this.inprice = inprice;
        this.outprice = outprice;
        this.goodstypeid = goodstypeid;
    }

    public Goods() {
        super();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getInprice() {
        return inprice;
    }

    public void setInprice(Float inprice) {
        this.inprice = inprice;
    }

    public Float getOutprice() {
        return outprice;
    }

    public void setOutprice(Float outprice) {
        this.outprice = outprice;
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", origin='" + origin + '\'' +
                ", producer='" + producer + '\'' +
                ", unit='" + unit + '\'' +
                ", inprice=" + inprice +
                ", outprice=" + outprice +
                ", goodstypeid=" + goodstypeid +
                '}';
    }
}