package com.davieyang.service;

import com.davieyang.dto.SysUserDTO;
import com.davieyang.model.SysUser;

import java.util.List;

/**
 * 用户服务接口
 * Created by davieyang on 2020/3/22.
 */
public interface SysUserService {

    List<SysUser> findAll();

    boolean save(SysUserDTO user);

    SysUser findById(Integer id);

    boolean update(SysUserDTO user);

    boolean updateStatus(SysUserDTO user);
}
