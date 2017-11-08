
package com.huarui.web.start;

import com.huarui.service.UserService;
import com.huarui.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by Administrator on 2017/11/8.
 */

@Controller
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/all")
    @ResponseBody
    public List<Users> findall() {
        return userService.findall();
    }

}

