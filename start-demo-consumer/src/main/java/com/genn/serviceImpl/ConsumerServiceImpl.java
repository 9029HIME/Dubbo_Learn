package com.genn.serviceImpl;

import com.genn.entity.User;
import com.genn.service.ConsumerService;
import com.genn.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private UserService userService;

    @Override
    public User DoUser() {
        return userService.findById(1L);
    }
}
