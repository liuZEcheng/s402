package com.huarui.service.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/11/8.
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:*.xml");
        context.start();
        System.out.println("服务启动了");
        System.in.read();
    }
}
