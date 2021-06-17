package com.davieyang.model;

import java.io.Serializable;
import java.util.List;

/**
 * 描述：角色实体
 *
 * @author davieyang
 * @create 2018/05/01
 **/
public class DyRole implements Serializable {

    private Integer id;

    private String name;

    private List<DyUser> dyUserList;

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

    public List<DyUser> getAyUserList() {
        return dyUserList;
    }

    public void setAyUserList(List<DyUser> dyUserList) {
        this.dyUserList = dyUserList;
    }
}
