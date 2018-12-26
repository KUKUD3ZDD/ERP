package com.zking.erp.statistics.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface SaleStaMapper {
    //销售统计分析
    Map<String,Object> saleList();



}
