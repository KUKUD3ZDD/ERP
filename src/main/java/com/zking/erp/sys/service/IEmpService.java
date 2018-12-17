package com.zking.erp.sys.service;

import com.zking.erp.sys.model.Emp;

import java.util.List;

public interface IEmpService {
    /**
     * 查询员工
     * @param emp
     * @return
     */
    List<Emp> queryLstEmp(Emp emp);
}