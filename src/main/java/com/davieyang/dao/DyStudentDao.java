package com.davieyang.dao;


import com.davieyang.model.DyStudent;

import java.util.List;

/**
 * 描述：学生DAO接口
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public interface DyStudentDao {

    DyStudent findById(Integer id);

    List<DyStudent> findBySchoolId(Integer id);
}
