package com.zking.erp.sys.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

@ToString
public class Permission extends BaseEntity {
    private Integer perid;

    private String pername;

    private Integer pid;

    private String permission;

    private String url;

    private Integer sort;

    public Permission(Integer perid, String pername, Integer pid, String permission, String url, Integer sort) {
        this.perid = perid;
        this.pername = pername;
        this.pid = pid;
        this.permission = permission;
        this.url = url;
        this.sort = sort;
    }

    public Permission() {
        super();
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}