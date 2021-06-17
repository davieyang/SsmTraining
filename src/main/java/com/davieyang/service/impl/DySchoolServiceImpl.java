package com.davieyang.service.impl;

import com.davieyang.dao.DySchoolDao;
import com.davieyang.model.DySchool;
import com.davieyang.service.DySchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author davieyang
 * @create 2018/05/01
 **/
@Service
public class DySchoolServiceImpl implements DySchoolService {

    @Resource
    private DySchoolDao dySchoolDao;

    public DySchool findById(Integer id) {
        return dySchoolDao.findById(id);
    }
}
