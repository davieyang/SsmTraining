package com.davieyang.dao;

import com.davieyang.model.DyUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DyUserDao {

    @Insert("INSERT INTO ay_user(name,password,age) VALUES(#{name}, #{password}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(DyUser dyUser);

    DyUser findById(String id);

    //    @Select("SELECT * FROM ay_user")
//    List<DyUser> findAll();
//    @Select("SELECT * FROM ay_user")
//    @Results({
//            @Result(id = true,column = "id",property = "id"),
//            @Result(column = "name",property = "name"),
//            @Result(column = "password",property = "password")
//    })
    List<DyUser> findAll();

//    @Select("SELECT * FROM ay_user WHERE id = #{id}")
//

    //    @Select("SELECT * FROM ay_user WHERE name = #{name}")
//    List<DyUser> findByName(String name);
//
//    int countByName(String name);
//
//    @Insert("INSERT INTO ay_user(name,password) VALUES(#{name}, #{password})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    int insert(DyUser dyUser);
//
    @Update("UPDATE  ay_user SET name = #{name}, password = #{password} WHERE id = #{id}")
    int update(DyUser dyUser);
//
//    @Delete("DELETE FROM ay_user WHERE id = #{id}")
//    int delete(int id);
//
//    @Delete("DELETE FROM ay_user WHERE name = #{name}")
//    int deleteByName(String name);

//    @Select("SELECT * FROM ay_user WHERE name = #{name} and password = #{password}")
//    List<DyUser> findByNameAndPassword(@Param("name") String name,@Param("password")String password);

//    List<DyUser> findByNameAndPassword(String name,String password);

//  List<DyUser> findByNameAndPassword(Map<String, String > map);

//    List<DyUser> findByIds(@Param("list") List<Integer> list);
}
