package com.davieyang.service;

import com.davieyang.model.DyUser;

import java.util.List;

public interface DyUserService {

    List<DyUser> findAll();

    //      List<DyUser> findAll(RowBounds rowBounds);
//
    DyUser findById(String id);

    //
//    List<DyUser> findByName(String name);
//
//    int countByName(String name);
//
    int insert(DyUser dyUser);

    //
    int update(DyUser dyUser);
//
//    int delete(int id);
//
//    int deleteByName(String name);

//    List<DyUser> findByNameAndPassword(Map<String, String> map);

//    List<DyUser> findByNameAndPassword(String name, String password);
//
//    List<DyUser> findByIds(List<Integer> ids);
}
