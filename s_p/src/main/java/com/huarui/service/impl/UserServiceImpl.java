package com.huarui.service.impl;

import com.huarui.service.UserService;
import com.huarui.service.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    public List<Users> findall() {
        System.out.println("2222222");
        List<Users> list = new ArrayList<Users>();
        for (int i = 0; i < 10; i++) {
            Users users = new Users(i,"zoukx"+i);
            list.add(users);

        }
        return  list;
    }
}
