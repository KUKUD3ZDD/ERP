package com.zking.erp.basic.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Client;

import java.util.List;

public interface IClientService {
    /**
     * 客户查询
     * @param s
     * @param pageBean
     * @return
     */
    List<Client> queryListClientPager(Client s, PageBean pageBean);

    /**
     * 客户删除
     * @param suid
     * @return
     */
    int deleteByPrimaryKey(Integer suid);

    /**
     * 客户修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Client record);

    /**
     * 客户新增
     * @param record
     * @return
     */
    int insert(Client record);
}
