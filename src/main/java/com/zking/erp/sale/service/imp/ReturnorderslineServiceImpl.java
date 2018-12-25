package com.zking.erp.sale.service.imp;

import com.zking.erp.sale.mapper.ReturnorderslineMapper;
import com.zking.erp.sale.model.Returnordersline;
import com.zking.erp.sale.service.IReturnorderslineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReturnorderslineServiceImpl implements IReturnorderslineService {

    @Autowired
    private ReturnorderslineMapper returnorderslineMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Returnordersline> queryReturnOrderslinePager(Returnordersline returnordersline) {
        return returnorderslineMapper.queryReturnOrderslinePager(returnordersline);
    }

    @Override
    public int insert(Returnordersline record) {
        return returnorderslineMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Returnordersline record) {
        return returnorderslineMapper.updateByPrimaryKey(record);
    }
}
