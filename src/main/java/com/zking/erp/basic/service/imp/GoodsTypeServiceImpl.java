package com.zking.erp.basic.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.mapper.GoodsTypeMapper;
import com.zking.erp.basic.model.GoodsType;
import com.zking.erp.basic.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService{

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Transactional(readOnly = true)
    @Override
    public List<GoodsType> queryListGoodsTypePager(GoodsType gt, PageBean pageBean) {
        return goodsTypeMapper.queryListGoodsTypePager(gt);
    }

    @Transactional(readOnly = true)
    @Override
    public int deleteByPrimaryKey(Integer gtid) {
        return goodsTypeMapper.deleteByPrimaryKey(gtid);
    }

    @Transactional(readOnly = true)
    @Override
    public int editGoodsType(GoodsType gt) {
        return goodsTypeMapper.editGoodsType(gt);
    }

    @Transactional(readOnly = true)
    @Override
    public int insert(GoodsType record) {
        return goodsTypeMapper.insert(record);
    }
}
