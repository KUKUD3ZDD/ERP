package com.zking.erp.repertory.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.mapper.StoredetailMapper;
import com.zking.erp.repertory.model.Storedetail;
import com.zking.erp.repertory.service.IStoredetailService;
import com.zking.erp.repertory.vo.StoredetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Storedetailimpl implements IStoredetailService{

    @Autowired
    private StoredetailMapper storedetailMapper;

    @Override
    public List<StoredetailVo> queryStoredetailPager(StoredetailVo stVo, PageBean pb) {
        return storedetailMapper.queryStoredetailPager(stVo);
    }

    @Override
    public int updateByPrimaryKey(Storedetail record) {
        return storedetailMapper.updateByPrimaryKey(record);
    }

    @Override
    public Storedetail StoreList(Storedetail storedetail) {
        return storedetailMapper.StoreList(storedetail);
    }


}
