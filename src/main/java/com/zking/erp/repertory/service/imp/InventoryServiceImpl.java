package com.zking.erp.repertory.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.mapper.InventoryMapper;
import com.zking.erp.repertory.service.IInventoryService;
import com.zking.erp.repertory.vo.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class InventoryServiceImpl implements IInventoryService {

    @Autowired
    private InventoryMapper inventoryMapper;

    @Transactional(readOnly = true)
    @Override
    public List<InventoryVo> queryInventoryVoPager(InventoryVo iv, PageBean pb) {
        return inventoryMapper.queryInventoryVoPager(iv);
    }
}
