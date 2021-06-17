package com.davieyang.service.impl;

import com.davieyang.dao.AySchoolDao;
import com.davieyang.dao.AyUserAddressDao;
import com.davieyang.model.AySchool;
import com.davieyang.model.AyUserAddress;
import com.davieyang.service.AySchoolService;
import com.davieyang.service.AyUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ay
 * @create 2018/05/01
 **/
@Service
public class AySchoolServiceImpl implements AySchoolService {

    @Resource
    private AySchoolDao aySchoolDao;

    public AySchool findById(Integer id) {
        return aySchoolDao.findById(id);
    }
}
