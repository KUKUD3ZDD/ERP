package com.zking.erp.repertory.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.model.Inventory;
import com.zking.erp.repertory.vo.InventoryVo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IInventoryService {
    /**
     * 分页查询盘盈盘亏表
     * @param iv
     * @return
     */
    List<InventoryVo> queryInventoryVoPager(InventoryVo iv, PageBean pb);
}