package com.davieyang.dao;

import com.davieyang.model.DyUserAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface DyUserAddressDao {

    DyUserAddress findById(Integer id);
}
