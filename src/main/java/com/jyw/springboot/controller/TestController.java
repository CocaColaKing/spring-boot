package com.jyw.springboot.controller;

import com.jyw.springboot.model.User;
import com.jyw.springboot.service.IUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author jiangyw
 * @date 2018/11/30 15:47
 */
@Controller
public class TestController {
    @Resource
    private IUser userService;


    @GetMapping("test")
    public String test(@RequestParam("id") int id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "test.html";
    }
}
