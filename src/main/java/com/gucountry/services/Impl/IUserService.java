package com.gucountry.services.Impl;

import com.gucountry.beans.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/1 0001.
 */
@Service
public interface IUserService {

    int insert(User user);
}
