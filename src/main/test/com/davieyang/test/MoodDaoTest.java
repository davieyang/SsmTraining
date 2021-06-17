package com.davieyang.test;

import com.davieyang.dao.MoodDao;
import com.davieyang.dao.UserDao;
import com.davieyang.model.Mood;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：用户DAO测试类
 *
 * @author Ay
 * @create 2018/05/04
 **/
public class MoodDaoTest extends BaseJunit4Test {

    @Resource
    private MoodDao moodDao;

    @Test
    public void testFindAll() {
        List<Mood> moodList = moodDao.findAll();
        System.out.println(moodList.size());
    }
}
