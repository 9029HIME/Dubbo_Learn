package com.genn.serviceImpl;


import com.genn.entity.User;
import com.genn.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername(String.format("我就是你要查询id为%s的用户",id));
        return user;
    }
}
