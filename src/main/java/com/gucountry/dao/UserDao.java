package com.gucountry.dao;
import com.gucountry.beans.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/12/1 0001.
 */
@Repository
public interface UserDao {

  int insert(User user);
}
