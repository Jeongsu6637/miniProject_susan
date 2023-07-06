package com.susan.controller;

import com.susan.domain.entity.Menu;
import com.susan.domain.entity.Store;
import com.susan.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/main")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/store")
    public ModelAndView AllStore(ModelAndView mav){
        List<Store> allStore = storeService.findAllStore();
        mav.addObject("stores", allStore);
        mav.setViewName("/user/store");
        return mav;
    }


    @GetMapping("/menu")
    public ModelAndView storeMenu(@RequestParam int store_seq, ModelAndView mav){
        List<Menu> allMenu = storeService.findAllMenu(store_seq);
        mav.addObject("menulist",allMenu);
        mav.setViewName("/user/menu");
        return mav;
    }


}
