package com.zking.erp.store.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.store.mapper.StoredetailMapper;
import com.zking.erp.store.model.Storedetail;
import com.zking.erp.store.service.IStoredetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StoredetailServiceImpl implements IStoredetailService {
    @Autowired
    private StoredetailMapper storedetailMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Storedetail> queryStorePager(Storedetail storedetail, PageBean pageBean) {
        return storedetailMapper.queryStorePager(storedetail);
    }

    @Override
    public int updateByPrimaryKey(Storedetail record) {
        return storedetailMapper.updateByPrimaryKey(record);
    }
}
