package com.davieyang.service.impl;

import com.davieyang.dao.AyUserAddressDao;
import com.davieyang.model.AyUserAddress;
import com.davieyang.service.AyUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ay
 * @create 2018/05/01
 **/
@Service
public class AyUserAddressServiceImpl implements AyUserAddressService {

    @Resource
    private AyUserAddressDao ayUserAddressDao;

    public AyUserAddress findById(Integer id) {
        return ayUserAddressDao.findById(id);
    }
}
