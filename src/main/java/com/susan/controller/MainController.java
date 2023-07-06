package com.susan.controller;

import com.susan.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    //login 이동

    @Autowired
    public RedisTemplate<String, User> redisTemplate;
    @GetMapping("/main")
    public ModelAndView mainPageGet(ModelAndView mav){
        User user = new User("test1", "1234", "서울", "테스트1", "010-1111-1111", 0);
        redisTemplate.opsForValue().set("login_user", user);

        user = redisTemplate.opsForValue().get("login_user");
        System.out.println(user);
        return mav;
    }
}
