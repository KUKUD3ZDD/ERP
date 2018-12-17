package com.zking.erp.sys.service.imp;

import com.zking.erp.sys.mapper.EmpMapper;
import com.zking.erp.sys.model.Emp;
import com.zking.erp.sys.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmpServiceImpl implements IEmpService{

    @Autowired
    private EmpMapper empMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Emp> queryLstEmp(Emp emp) {
        return empMapper.queryLstEmp(emp);
    }
}
