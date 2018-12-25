package com.zking.erp.sale.service.imp;

import com.zking.erp.sale.mapper.BuyorderslineMapper;
import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.sale.model.Returnordersline;
import com.zking.erp.sale.service.IBuyorderslineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BuyorderslineServiceImpl implements IBuyorderslineService {
    @Autowired
    private BuyorderslineMapper buyorderslineMapper;
    @Override
    public int insert(Buyordersline record) {
        return buyorderslineMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer boid) {
        return buyorderslineMapper.deleteByPrimaryKey(boid);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Buyordersline> querylinePager(Buyordersline buyordersline) {

        return buyorderslineMapper.querylinePager(buyordersline);
    }

    @Override
    public int updateByPrimaryKey(Buyordersline record) {
        return buyorderslineMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertBatch(List<Buyordersline> list) {
        return buyorderslineMapper.insertBatch(list);
    }

    @Override
    public Map<String, Object> empList(Buyordersline buyordersline) {
        return buyorderslineMapper.empList(buyordersline);
    }

}
