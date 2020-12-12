package com.genn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.genn.entity.User;
import com.genn.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    //消费者使用@Reference注解引入外部服务接口爱妻
    //check为false则不检查是否已实例化，从而避免循环依赖问题。当服务重启时会自动实例化
    @Reference(check = false)
    private UserService userService;


    @GetMapping("/getUser/{id}")
    public User findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
}
