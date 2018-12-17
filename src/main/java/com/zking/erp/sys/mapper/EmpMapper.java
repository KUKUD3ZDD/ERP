package com.zking.erp.sys.mapper;

import com.zking.erp.sys.model.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    /**
     * 查询员工
     * @param emp
     * @return
     */
    List<Emp> queryLstEmp(Emp emp);
}