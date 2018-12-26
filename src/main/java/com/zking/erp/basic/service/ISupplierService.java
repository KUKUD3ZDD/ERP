package com.zking.erp.basic.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Supplier;

import java.util.List;

public interface ISupplierService {
    /**
     * 供应商查询
     * @param s
     * @param pageBean
     * @return
     */
    List<Supplier> queryListSupplierPager(Supplier s, PageBean pageBean);

    /**
     * 供应商删除
     * @param suid
     * @return
     */
    int deleteByPrimaryKey(Integer suid);

    /**
     * 供应商修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Supplier record);

    /**
     * 供应商新增
     * @param record
     * @return
     */
    int insert(Supplier record);

    //查询客户
    List<Supplier> querySupplier(Supplier supplier);
}
