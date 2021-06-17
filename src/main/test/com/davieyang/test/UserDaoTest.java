package com.davieyang.test;

import com.davieyang.dao.UserDao;
import com.davieyang.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：用户DAO测试类
 *
 * @author davieyang
 * @create 2018/05/04
 **/
public class UserDaoTest extends BaseJunit4Test {

    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll() {
        User user = userDao.find("1");
        System.out.println(user);
    }
}
