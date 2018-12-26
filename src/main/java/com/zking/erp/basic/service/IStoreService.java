package com.zking.erp.basic.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Store;

import java.util.List;

public interface IStoreService {
    /**
     * 仓库查询
     * @param store
     * @return
     */
    List<Store> queryListStorePager(Store store, PageBean pageBean);

    /**
     * 仓库删除
     * @param sid
     * @return
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * 仓库修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Store record);

    /**
     * 仓库新增
     * @param record
     * @return
     */
    int insert(Store record);
}
