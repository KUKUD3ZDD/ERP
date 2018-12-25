package com.zking.erp.store.service.imp;

import com.zking.erp.store.mapper.StoreMapper;
import com.zking.erp.store.model.Store;
import com.zking.erp.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreMapper storeMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Store> queryStore(Store store) {
        return storeMapper.queryStore(store);
    }
}
