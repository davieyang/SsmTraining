package com.davieyang.service;

import com.davieyang.model.DyStudent;

/**
 * 描述：地址服务接口
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public interface DyStudentService {

    DyStudent findById(Integer id);
}
