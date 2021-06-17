package com.davieyang.controller;

import com.davieyang.model.DyUserAddress;
import com.davieyang.service.DyUserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 描述：地址控制层
 *
 * @author Ay
 * @create 2018/05/01
 **/
@Controller
@RequestMapping(value = "/address")
public class DyUserAddressController {

    @Resource
    private DyUserAddressService dyUserAddressService;

    @GetMapping("/findById")
    public String findById(Model model) {
        DyUserAddress dyUserAddress = dyUserAddressService.findById(1);
        return "success";
    }
}
