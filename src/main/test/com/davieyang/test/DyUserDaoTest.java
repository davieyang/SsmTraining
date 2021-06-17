package com.davieyang.test;

import com.davieyang.dao.DyUserDao;
import com.davieyang.model.DyUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：用户DAO测试类
 *
 * @author davieyang
 * @create 2018/05/04
 **/
public class DyUserDaoTest extends BaseJunit4Test {

    @Resource
    private DyUserDao dyUserDao;

//    @Test
//    public void testFindAll(){
//        List<DyUser> userList = dyUserDao.findAll(new RowBounds(0, 5));
//        for(DyUser ayUser: userList){
//            System.out.println("name: " + ayUser.getName());
//        }
//    }

    @Test
    public void testPageHelper() {
        //startPage(第几页, 多少条数据)
        PageHelper.startPage(0, 1);
        //查询所有用户
        List<DyUser> userList = dyUserDao.findAll();
        //用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(userList);
    }

    @Resource
    private SqlSessionFactoryBean sqlSessionFactoryBean;

    @Test
    public void testSessionCache() throws Exception {
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DyUserDao dyUserDao = sqlSession.getMapper(DyUserDao.class);
        //第一次查询
        DyUser dyUser = dyUserDao.findById("1");
        System.out.println("name: " + dyUser.getName()
                + "  password:" + dyUser.getPassword());

        //执行commit操作（如：更新、插入、删除等操作）
        DyUser user = new DyUser();
        user.setId(1);
        user.setName("al");
        dyUserDao.update(dyUser);

        //第二次查询
        DyUser dyUser2 = dyUserDao.findById("1");
        System.out.println("name: " + dyUser2.getName()
                + "  password:" + dyUser2.getPassword());
        sqlSession.close();
        ;
    }

}
