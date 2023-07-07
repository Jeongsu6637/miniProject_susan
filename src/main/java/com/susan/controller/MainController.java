package com.susan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/front")
public class MainController {

    @GetMapping("/admin")
    public ModelAndView showAdminPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/front/admin");
        return mav;
    }
}
