package com.susan.controller;

import com.susan.domain.entity.User;
import com.susan.domain.request.LoginRequest;
import com.susan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "/user/login";
    }

    @PostMapping("/login")
    public ModelAndView postLogin(
            @ModelAttribute LoginRequest loginRequest,
            ModelAndView mav,
            HttpSession httpsession
    ) {
        User login = userService.login(loginRequest);

        return mav;
    }
}



    //회원가입으로 이동

    //비밀번호, id 찾기

