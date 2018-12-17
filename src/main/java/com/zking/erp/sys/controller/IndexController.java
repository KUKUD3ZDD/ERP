package com.zking.erp.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/home/index.shtml")
    public String toIndex(){
        System.out.println("哈哈");
        return "/page/index.jsp";
    }

}
