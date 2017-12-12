package com.gucountry.controller;

import com.gucountry.beans.User;
import com.gucountry.services.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/1 0001.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/up")
    public String up(){
        return "up";
    }

    @RequestMapping(value = "/addInfo" , method = RequestMethod.POST)
    public String addInfo(@RequestParam(value = "name") String name,
                         @RequestParam(value = "email") String email,
                         @RequestParam(value = "phone") String phone,
                         @RequestParam(value = "addr") String addr,
                         Model model) {

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAddr(addr);
        userService.insert(user);
        return "success";
    }


}
