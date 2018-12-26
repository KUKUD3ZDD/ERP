package com.zking.erp.basic.mapper;

import com.zking.erp.basic.model.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SupplierMapper {

    //供应商删除
    int deleteByPrimaryKey(Integer suid);

    //供应商新增
    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer suid);

    int updateByPrimaryKeySelective(Supplier record);

    //供应商修改
    int updateByPrimaryKey(Supplier record);

    //供应商查询
    List<Supplier> queryListSupplierPager(Supplier s);

    //查询客户
    List<Supplier> querySupplier(Supplier supplier);

}