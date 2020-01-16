package com.ssm.login.demo.service.impl;

import com.ssm.login.demo.dao.UserDao;
import com.ssm.login.demo.entity.User;
import com.ssm.login.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author malikai
 * @version 1.0
 * @date 2020-1-16 16:41
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkLogin(User user) {

        return userDao.findByUser(user);
    }
}
