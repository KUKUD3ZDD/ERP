package com.zking.erp.store.service.imp;

import com.zking.erp.store.mapper.StoreoperMapper;
import com.zking.erp.store.model.Storeoper;
import com.zking.erp.store.service.StoreoperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StoreoperServiceImpl implements StoreoperService {

    @Autowired
    private StoreoperMapper storeoperMapper;

    @Override
    public int insert(Storeoper storeoper) {
        return storeoperMapper.insert(storeoper);
    }
}
