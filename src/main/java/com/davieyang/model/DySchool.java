package com.davieyang.model;

import java.io.Serializable;
import java.util.List;

/**
 * 描述：学校实体
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public class DySchool implements Serializable {

    private Integer id;
    private String name;
    //一个学校有多个学生
    private List<DyStudent> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DyStudent> getStudents() {
        return students;
    }

    public void setStudents(List<DyStudent> students) {
        this.students = students;
    }
}
