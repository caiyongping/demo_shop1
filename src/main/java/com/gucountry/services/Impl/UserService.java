package com.gucountry.services.Impl;

import com.gucountry.beans.User;
import com.gucountry.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/1 0001.
 */
@Service
public class UserService implements IUserService{
    @Autowired
    UserDao userDao;
    public int insert(User user) {
        return userDao.insert(user);
    }




}
