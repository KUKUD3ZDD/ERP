package com.zking.erp.sale.service.imp;

import com.zking.erp.sale.mapper.SupplierMapper;
import com.zking.erp.sale.model.Supplier;
import com.zking.erp.sale.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Supplier> querySupplier(Supplier supplier) {
        return supplierMapper.querySupplier(supplier);
    }
}
