package com.davieyang.service.impl;

import com.davieyang.dao.AyRoleDao;
import com.davieyang.dao.AyUserDao;
import com.davieyang.model.AyRole;
import com.davieyang.model.AyUser;
import com.davieyang.service.AyRoleService;
import com.davieyang.service.AyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AyRoleServiceImpl implements AyRoleService {

    @Resource
    private AyRoleDao ayRoleDao;

    public AyRole findById(String id) {
        return ayRoleDao.findById(id);
    }
}
