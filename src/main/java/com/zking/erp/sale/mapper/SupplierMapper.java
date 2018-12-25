package com.zking.erp.sale.mapper;


import com.zking.erp.sale.model.Supplier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface SupplierMapper {
    int deleteByPrimaryKey(Integer suid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer suid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
    //查询客户
    List<Supplier> querySupplier(Supplier supplier);
}