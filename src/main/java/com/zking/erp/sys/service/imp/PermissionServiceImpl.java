package com.zking.erp.sys.service.imp;

import com.zking.erp.sys.mapper.PermissionMapper;
import com.zking.erp.sys.model.Permission;
import com.zking.erp.sys.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Permission> queryLstPer(Permission per) {
        return permissionMapper.queryLstPer(per);
    }
}
