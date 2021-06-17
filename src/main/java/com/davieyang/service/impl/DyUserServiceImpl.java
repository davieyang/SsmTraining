package com.davieyang.service.impl;

import com.davieyang.dao.DyUserDao;
import com.davieyang.model.DyUser;
import com.davieyang.service.DyUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DyUserServiceImpl implements DyUserService {

    @Resource
    private DyUserDao dyUserDao;

    public List<DyUser> findAll() {
        return dyUserDao.findAll();
    }

    //
    public DyUser findById(String id) {
        return dyUserDao.findById(id);
    }

    //
//    public List<DyUser> findByName(String name) {
//        return dyUserDao.findByName(name);
//    }
//
//    public int countByName(String name) {
//        return dyUserDao.countByName(name);
//    }
//
    public int insert(DyUser dyUser) {
        return dyUserDao.insert(dyUser);
    }

    @Transactional
    public int update(DyUser dyUser) {
        int count = dyUserDao.update(dyUser);
        String s = null;
        s.split(",");
        return count;
    }
//
//    public int delete(int id) {
//        return dyUserDao.delete(id);
//    }
//
//    public int deleteByName(String name) {
//        return dyUserDao.deleteByName(name);
//    }
//
//    public List<DyUser> findByIds(List<Integer> ids) {
//        return dyUserDao.findByIds(ids);
//    }
//
//    public List<DyUser> findByNameAndPassword(String name, String password) {
//        return dyUserDao.findByNameAndPassword(name, password);
//    }

//    public List<DyUser> findByNameAndPassword(Map<String,String> map) {
//        return dyUserDao.findByNameAndPassword(map);
//    }
}
