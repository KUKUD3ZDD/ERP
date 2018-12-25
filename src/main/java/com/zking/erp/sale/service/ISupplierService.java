package com.zking.erp.sale.service;

import com.zking.erp.sale.model.Supplier;

import java.util.List;

public interface ISupplierService {
    //查询客户
    List<Supplier> querySupplier(Supplier supplier);
}
