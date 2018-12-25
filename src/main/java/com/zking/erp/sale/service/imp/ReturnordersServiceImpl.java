package com.zking.erp.sale.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.mapper.ReturnordersMapper;
import com.zking.erp.sale.model.Returnorders;
import com.zking.erp.sale.service.IReturnordersService;
import com.zking.erp.sale.vo.ReturnordersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ReturnordersServiceImpl implements IReturnordersService {

    @Autowired
    private ReturnordersMapper returnordersMapper;

    @Transactional(readOnly = true)
    @Override
    public List<ReturnordersVo> queryReturnPager(ReturnordersVo returnordersVo,PageBean pageBean) {
        return returnordersMapper.queryReturnPager(returnordersVo);
    }

    @Override
    public int insert(Returnorders record) {
        return returnordersMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Returnorders record) {

        return returnordersMapper.updateByPrimaryKey(record);
    }
}
