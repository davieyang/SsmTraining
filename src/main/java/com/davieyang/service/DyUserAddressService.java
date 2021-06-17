package com.davieyang.service;

import com.davieyang.model.DyUserAddress;

/**
 * 描述：地址服务接口
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public interface DyUserAddressService {

    DyUserAddress findById(Integer id);
}
