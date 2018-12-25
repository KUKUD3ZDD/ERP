package com.zking.erp.sale.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.mapper.BuyordersMapper;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.service.IBuyordersService;
import com.zking.erp.sale.vo.BuyordersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BuyordersServiceImpl implements IBuyordersService {

    @Autowired
    private BuyordersMapper buyordersMapper;
    @Transactional(readOnly = true)
    @Override
    public List<BuyordersVo> queryListPager(BuyordersVo buyordersVo, PageBean pageBean) {
        return buyordersMapper.queryListPager(buyordersVo);
    }

    @Override
    public int insert(Buyorders record) {
        return buyordersMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Buyorders record) {
        return buyordersMapper.updateByPrimaryKey(record);
    }
}
