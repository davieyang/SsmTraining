package com.davieyang.service.impl;

import com.davieyang.dao.DyUserAddressDao;
import com.davieyang.model.DyUserAddress;
import com.davieyang.service.DyUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author davieyang
 * @create 2018/05/01
 **/
@Service
public class DyUserAddressServiceImpl implements DyUserAddressService {

    @Resource
    private DyUserAddressDao dyUserAddressDao;

    public DyUserAddress findById(Integer id) {
        return dyUserAddressDao.findById(id);
    }
}
