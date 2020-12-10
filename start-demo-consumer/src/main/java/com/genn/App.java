package com.genn;

import com.genn.entity.User;
import com.genn.service.ConsumerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:consumer.xml"}
        );
        context.start();
        ConsumerService consumerService = context.getBean(ConsumerService.class);
        User user = consumerService.DoUser();
        System.out.println(user);
        System.in.read();
    }
}
