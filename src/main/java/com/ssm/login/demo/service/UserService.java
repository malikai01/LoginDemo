package com.ssm.login.demo.service;

import com.ssm.login.demo.entity.User;

public interface UserService {
    /**
     * 登录验证
     * @param user
     * @return
     */
    User checkLogin(User user);
}
