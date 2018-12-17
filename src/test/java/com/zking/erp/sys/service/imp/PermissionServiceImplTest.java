package com.zking.erp.sys.service.imp;

import com.zking.erp.sys.model.Permission;
import com.zking.erp.sys.service.IPermissionService;
import imp.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class PermissionServiceImplTest extends BaseTestCase {
    Permission p=new Permission();
    @Autowired
    IPermissionService permissionService;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void queryLstPer() {
        List<Permission> permissions = permissionService.queryLstPer(p);
        for (Permission permission : permissions) {
            System.out.println(permission);
        }
        
    }
}