package com.davieyang.dao;

import com.davieyang.model.AySchool;

/**
 * 描述：学校DAO接口
 *
 * @author Ay
 * @create 2018/05/01
 **/
public interface AySchoolDao {

    AySchool findById(Integer id);
}
