package com.ssm.login.demo.dao;

import com.ssm.login.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author malikai
 * @version 1.0
 * @date 2020-1-16 16:40
 */
@Repository
public interface UserDao {

    /**
     *
     * 查找用户
     */
    User findByUser(User user);
}
