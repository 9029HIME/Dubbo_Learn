package com.genn.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.genn.entity.User;
import com.genn.service.UserService;
import org.springframework.stereotype.Component;

@Component
//dubbo的service，将接口注册到服务中心内，供其他微服务调用
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findById(Long id) {
        User user = new User();
        String username = String.format("我是Springboot项目中查询到的user，" +
                "id为%s",id);
        user.setUsername(username);
        user.setId(id);
        return user;
    }
}
