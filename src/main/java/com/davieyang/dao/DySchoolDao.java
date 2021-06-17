package com.davieyang.dao;

import com.davieyang.model.DySchool;

/**
 * 描述：学校DAO接口
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public interface DySchoolDao {

    DySchool findById(Integer id);
}
