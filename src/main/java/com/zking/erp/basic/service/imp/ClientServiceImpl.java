package com.zking.erp.basic.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.mapper.ClientMapper;
import com.zking.erp.basic.model.Client;
import com.zking.erp.basic.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public List<Client> queryListClientPager(Client c, PageBean pageBean) {
        return clientMapper.queryListClientPager(c);
    }

    @Override
    public int deleteByPrimaryKey(Integer suid) {
        return clientMapper.deleteByPrimaryKey(suid);
    }

    @Override
    public int updateByPrimaryKey(Client record) {
        return clientMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(Client record) {
        return clientMapper.insert(record);
    }
}
