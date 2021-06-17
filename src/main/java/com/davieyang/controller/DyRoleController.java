package com.davieyang.controller;

import com.davieyang.model.DyRole;
import com.davieyang.service.DyRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Ay
 * @date 2018/04/02
 */
@Controller
@RequestMapping(value = "/role")
public class DyRoleController {

    @Resource
    private DyRoleService dyRoleService;

    @GetMapping("/findById")
    public String findById(Model model) {
        DyRole dyRole = dyRoleService.findById("1");
        return "success";
    }

}
