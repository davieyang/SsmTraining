package com.davieyang.dao;

import com.davieyang.model.UserMoodPraiseRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 描述：用户说说点赞关联DAO
 *
 * @author davieyang
 * @create 2018/07/01
 **/
@Repository
public interface UserMoodPraiseRelDao {

    boolean save(@Param("userMoodPraiseRel") UserMoodPraiseRel userMoodPraiseRel);
}
