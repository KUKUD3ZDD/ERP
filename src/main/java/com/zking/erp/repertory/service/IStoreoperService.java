package com.zking.erp.repertory.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.model.Storeoper;
import com.zking.erp.repertory.vo.StoreoperVo;

import java.util.List;

public interface IStoreoperService {

    /**
     * 分页查询库存变动记录
     * @param sto
     * @return
     */
    List<StoreoperVo> queryStoreoperPager(StoreoperVo sto, PageBean pb);

    //添加库存变动记录
    int insert(Storeoper record);

}