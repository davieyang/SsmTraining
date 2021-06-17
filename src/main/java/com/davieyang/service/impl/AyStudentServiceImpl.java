package com.davieyang.service.impl;

import com.davieyang.dao.AyStudentDao;
import com.davieyang.dao.AyUserAddressDao;
import com.davieyang.model.AyStudent;
import com.davieyang.model.AyUserAddress;
import com.davieyang.service.AyStudentService;
import com.davieyang.service.AyUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ay
 * @create 2018/05/01
 **/
@Service
public class AyStudentServiceImpl implements AyStudentService {

    @Resource
    private AyStudentDao ayStudentDao;

    public AyStudent findById(Integer id) {
        return ayStudentDao.findById(id);
    }
}
