package com.genn.config;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.genn.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

@Configuration
public class InterfaceConfig {

    /**
     * 基于注解类的形式配置Dubbo
     * @param userService
     * @return
     */
//    @Bean
//    public ServiceConfig<UserService> userServiceConfig(UserService userService){
//        ServiceConfig<UserService> userServiceConfig = new ServiceConfig<>();
//        userServiceConfig.setInterface(UserService.class);
//        userServiceConfig.setRef(userService);
//        userServiceConfig.setVersion("1.0.0");
//
//        MethodConfig findById = new MethodConfig();
//        findById.setName("findById");
//        findById.setTimeout(1000);
//
//        List<MethodConfig> methods = new LinkedList<>();
//        methods.add(findById);
//        userServiceConfig.setMethods(methods);
//        //TODO 除此以外，还有ProviderConfig,MonitorConfig等等
//        return userServiceConfig;
//    }
}
