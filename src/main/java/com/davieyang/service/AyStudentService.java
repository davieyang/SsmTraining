package com.davieyang.service;

import com.davieyang.model.AyStudent;
import com.davieyang.model.AyUserAddress;

/**
 * 描述：地址服务接口
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public interface AyStudentService {

    AyStudent findById(Integer id);
}
