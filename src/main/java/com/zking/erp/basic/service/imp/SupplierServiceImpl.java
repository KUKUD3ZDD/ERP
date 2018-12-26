package com.zking.erp.basic.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.mapper.SupplierMapper;
import com.zking.erp.basic.model.Supplier;
import com.zking.erp.basic.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<Supplier> queryListSupplierPager(Supplier s, PageBean pageBean) {
        return supplierMapper.queryListSupplierPager(s);
    }

    @Override
    public int deleteByPrimaryKey(Integer suid) {
        return supplierMapper.deleteByPrimaryKey(suid);
    }

    @Override
    public int updateByPrimaryKey(Supplier record) {
        return supplierMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(Supplier record) {
        return supplierMapper.insert(record);
    }

    @Override
    public List<Supplier> querySupplier(Supplier supplier) {
        return supplierMapper.querySupplier(supplier);
    }
}
