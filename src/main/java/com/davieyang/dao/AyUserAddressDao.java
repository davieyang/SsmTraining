package com.davieyang.dao;

import com.davieyang.model.AyUser;
import com.davieyang.model.AyUserAddress;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AyUserAddressDao {

    AyUserAddress findById(Integer id);
}
