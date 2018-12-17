package com.zking.erp.sys.controller;

import com.zking.erp.sys.model.Permission;
import com.zking.erp.sys.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/Permission")
@Controller
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;

    @RequestMapping(value = "/queryLstPer")
    @ResponseBody
    public List queryLstPer(Permission permission){
        System.out.println("到了");
        List<Permission> lst = permissionService.queryLstPer(permission);
        return  lst;
    }
}
