package com.zking.erp.repertory.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.model.Storedetail;
import com.zking.erp.repertory.vo.StoredetailVo;

import java.util.List;

public interface IStoredetailService {
    List<StoredetailVo> queryStoredetailPager(StoredetailVo stVo, PageBean pb); //库存查询

    //修改库存数量
    int updateByPrimaryKey(Storedetail record);

    //根据商品id查询库存
    Storedetail StoreList(Storedetail storedetail);
}
