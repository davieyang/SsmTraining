package com.davieyang.controller;

import com.davieyang.model.DySchool;
import com.davieyang.service.DySchoolService;
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
@RequestMapping(value = "/school")
public class DySchoolController {

    @Resource
    private DySchoolService dySchoolService;

    @GetMapping("/findById")
    public String findById(Model model) {
        DySchool dySchool = dySchoolService.findById(1);
        return "success";
    }
}
