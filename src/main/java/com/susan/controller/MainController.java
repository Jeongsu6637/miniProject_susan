package com.susan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/front")
public class MainController {

    @GetMapping
    public ModelAndView showMainPage() {
        ModelAndView mav = new ModelAndView();
        // 필요한 데이터 처리 및 뷰 설정
        mav.setViewName("main"); // main.jsp의 이름
        return mav;
    }
}
