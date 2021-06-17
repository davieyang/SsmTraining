package com.davieyang.service.impl;

import com.davieyang.dao.DyRoleDao;
import com.davieyang.model.DyRole;
import com.davieyang.service.DyRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DyRoleServiceImpl implements DyRoleService {

    @Resource
    private DyRoleDao ayRoleDao;

    public DyRole findById(String id) {
        return ayRoleDao.findById(id);
    }
}
