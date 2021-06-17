package com.davieyang.model;

import java.io.Serializable;

/**
 * 描述：用户地址实体
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public class DyUserAddress implements Serializable {

    private Integer id;
    private String name;

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
}
