package com.zking.erp.basic.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Client;
import com.zking.erp.basic.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/queryListClientPager")
    @ResponseBody
    private Map<String, Object> queryListClientPager(Client c, HttpServletRequest req, String ss){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        c.setSuname(ss);
        c.setSuaddress(ss);
        c.setSucontact(ss);
        c.setSutel(ss);
        c.setSuemail(ss);
        Map<String,Object> map = new HashMap<String, Object>();
        List<Client> list=clientService.queryListClientPager(c,pageBean);
        System.out.println(list);
        map.put("data",list);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    @RequestMapping(value = "/delClient")
    @ResponseBody
    public Map<String,Object> delClient(Integer suid){
        clientService.deleteByPrimaryKey(suid);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping(value = "/editClient")
    @ResponseBody
    public Map<String,Object> editClient(Client c){
        c.setSutype("客户");
        clientService.updateByPrimaryKey(c);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        return map;
    }

    @RequestMapping(value = "/addClient")
    @ResponseBody
    public Map<String,Object> addClient(Client c){
        c.setSutype("客户");
        clientService.insert(c);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","添加成功");
        return map;
    }
}
