package com.zking.erp.repertory.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.mapper.StoreoperMapper;
import com.zking.erp.repertory.model.Storeoper;
import com.zking.erp.repertory.service.IStoreoperService;
import com.zking.erp.repertory.vo.StoreoperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreoperServiceImpl implements IStoreoperService {
    @Autowired
    private StoreoperMapper storeoperMapper;

    @Override
    public List<StoreoperVo> queryStoreoperPager(StoreoperVo sto, PageBean pb) {
        return storeoperMapper.queryStoreoperPager(sto);
    }

    @Override
    public int insert(Storeoper record) {
        return storeoperMapper.insert(record);
    }
}
