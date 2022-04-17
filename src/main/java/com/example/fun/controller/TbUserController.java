package com.example.fun.controller;


import com.example.fun.entity.TbUser;
import com.example.fun.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author tingting
 * @since 2022-04-17
 */
@RestController
@RequestMapping("/user")
public class TbUserController {

    @Autowired
    private TbUserService userService;

    @GetMapping(value = "list", produces = "application/json")
    @ResponseBody
    public List<TbUser> list() {
       return userService.list();
    }


    @PostMapping(value = "add", produces = "application/json")
    @ResponseBody
    public void add(@RequestBody TbUser user, HttpServletRequest request) {
       userService.save(user);
    }

}

