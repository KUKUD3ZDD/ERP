package com.zking.erp.store.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.store.model.Storedetail;

import java.util.List;

public interface IStoredetailService {

    //查询库存
    List<Storedetail> queryStorePager(Storedetail storedetail, PageBean pageBean);

    //修改库存数量
    int updateByPrimaryKey(Storedetail record);
}
