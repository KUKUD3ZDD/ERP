package com.zking.erp.basic.mapper;

import com.zking.erp.basic.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientMapper {

    //客户删除
    int deleteByPrimaryKey(Integer suid);

    //客户新增
    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer suid);

    int updateByPrimaryKeySelective(Client record);

    //客户修改
    int updateByPrimaryKey(Client record);

    //客户查询
    List<Client> queryListClientPager(Client c);


}