package com.zking.erp.statistics.service.imp;

import com.zking.erp.statistics.mapper.SaleStaMapper;
import com.zking.erp.statistics.service.ISaleStaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional
@Service
public class SaleStaServiceImpl implements ISaleStaService {

    @Autowired
    private SaleStaMapper saleStaMapper;

    @Override
    public Map<String, Object> saleList() {
        return saleStaMapper.saleList();
    }
}
