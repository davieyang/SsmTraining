package com.davieyang.service.impl;

import com.davieyang.dao.DyStudentDao;
import com.davieyang.model.DyStudent;
import com.davieyang.service.DyStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author davieyang
 * @create 2018/05/01
 **/
@Service
public class DyStudentServiceImpl implements DyStudentService {

    @Resource
    private DyStudentDao dyStudentDao;

    public DyStudent findById(Integer id) {
        return dyStudentDao.findById(id);
    }
}
