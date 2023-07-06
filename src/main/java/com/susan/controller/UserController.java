package com.susan.controller;

import com.susan.domain.entity.SearchByKeyword;
import com.susan.domain.request.ShowDetailRequest;
import com.susan.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    private final ProductService productService;

    public UserController(ProductService productService) {
        this.productService = productService;
    }

//    @GetMapping("/front/main")
//    public ModelAndView showMain(ModelAndView mav, HttpSession session) {
//        mav.setViewName("/front/main");
//        String keyword = (String) session.getAttribute("keyword");
//        if (keyword != null) {
//            List<SearchByKeyword> searchList = productService.searchDefault(keyword);
//            mav.addObject("searchlist", searchList);
//        }
//        return mav;
//    }
    @GetMapping("/front/main")
    public ModelAndView showMain(ModelAndView modelAndView
                                ,@RequestParam(value = "keyword", required = false) String keyword
                                ,@RequestParam(value = "category", required = false) String category
            ){
        if (category != null) {
            switch (category) {
                case "a":
                    List<SearchByKeyword> Default = productService.searchDefault(keyword);
                    return modelAndView.addObject("searchlist", Default);
                case "b":
                    List<SearchByKeyword> Desc = productService.searchDesc(keyword);
                    return modelAndView.addObject("searchlist", Desc);
                case "c":
                    List<SearchByKeyword> Asc = productService.searchAsc(keyword);
                    return modelAndView.addObject("searchlist", Asc);
            }
        }
        modelAndView.setViewName("/front/main");
        return modelAndView;


    }

    @PostMapping("/front/main")
    public ModelAndView showSearch(
            @RequestParam("keyword") String keyword,
            @RequestParam(value = "category", required = false) String category,
            ModelAndView modelAndView,
            HttpSession session
    ) {
        session.setAttribute("keyword", keyword);
        if (category != null) {
            switch (category) {
                case "a":
                    List<SearchByKeyword> Default = productService.searchDefault(keyword);
                    return modelAndView.addObject("searchlist", Default);
                case "b":
                    List<SearchByKeyword> Desc = productService.searchDesc(keyword);
                    return modelAndView.addObject("searchlist", Desc);
                case "c":
                    List<SearchByKeyword> Asc = productService.searchAsc(keyword);
                    return modelAndView.addObject("searchlist", Asc);
            }
        } else {
            List<SearchByKeyword> Default = productService.searchDefault(keyword);
            modelAndView.addObject("searchlist", Default);
        }
        modelAndView.setViewName("/front/main");
        return modelAndView;
    }

    @GetMapping("/front/detail")
    public ModelAndView showDetail(ModelAndView mav,
                                   @RequestParam("name") String name
    ){
        List<ShowDetailRequest> show = productService.showDetail(name);

        for (ShowDetailRequest showDetailRequest :show) {
            System.out.println(showDetailRequest);
        }

        mav.addObject("store_name", show.get(0).getStore_name());
        mav.addObject("image_link", show.get(0).getImage_link());
        mav.addObject("store_number", show.get(0).getStore_number());
        mav.addObject("location", show.get(0).getLocation());

        mav.addObject("showList", show);

        mav.setViewName("/front/detail");
        return mav;
    }




}
