package com.ssm.login.demo.controller;

import com.ssm.login.demo.entity.User;
import com.ssm.login.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

/**
 * @author malikai
 * @version 1.0
 * @date 2020-1-16 16:46
 */
@Controller
@RequestMapping("/")
@SessionAttributes("username")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    //测试前台能否正常访问
    @RequestMapping(value = "/toLogin")
    public String toIndex() {
        return "login";
    }

    //登录功能实现
    @RequestMapping(value = "/checkLogin")
    public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        User user = new User();
        user.setName(username);
        user.setPwd(password);
        if (userService.checkLogin(user) != null) {
            model.addAttribute("username", username);
            return "homePage";
        } else {
            return "fail";
        }
    }
}
