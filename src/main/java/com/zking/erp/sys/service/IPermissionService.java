package com.zking.erp.sys.service;

import com.zking.erp.sys.model.Permission;

import java.util.List;

public interface IPermissionService {

    /**
     * 查询所有的权限
     * @param per
     * @return
     */
    List<Permission> queryLstPer(Permission per);


}