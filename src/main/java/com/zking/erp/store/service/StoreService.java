package com.zking.erp.store.service;

import com.zking.erp.store.model.Store;

import java.util.List;

public interface StoreService {

    //查询仓库
    List<Store> queryStore(Store store);
}
