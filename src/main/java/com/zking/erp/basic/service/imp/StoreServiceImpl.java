package com.zking.erp.basic.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.mapper.StoreMapper;
import com.zking.erp.basic.model.Store;
import com.zking.erp.basic.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StoreServiceImpl implements IStoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public List<Store> queryListStorePager(Store store, PageBean pageBean) {
        return storeMapper.queryListStorePager(store);
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return storeMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKey(Store record) {
        return storeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(Store record) {
        return storeMapper.insert(record);
    }
}
