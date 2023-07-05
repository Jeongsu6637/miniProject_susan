package com.susan.controller;

import com.susan.domain.entity.SearchByKeyword;
import com.susan.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    private final ProductService productService;

    public UserController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/main/main")
    public ModelAndView showMain(
            @RequestParam(value = "keyword", required = false) String keyword,
            ModelAndView modelAndView
    ){
        System.out.println("여기까지는 됨");
        modelAndView.setViewName("/main/main");
        List<SearchByKeyword> ByKeyword = productService.searchByKeyword(keyword);
        System.out.println("여기까지도 됨");
        modelAndView.addObject("todolist", ByKeyword);
        return modelAndView ;
    }
}
