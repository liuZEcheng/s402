package com.huarui.web.start;

import com.huarui.service.UserService;
import com.huarui.service.Users;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:*.xml");
        UserService service = context.getBean(UserService.class);
        List<Users> list = service.findall();
        for (Users users : list) {
            System.out.println(users.getUname());
        }
    }
}
