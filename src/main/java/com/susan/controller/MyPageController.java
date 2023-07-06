package com.susan.controller;

import com.susan.domain.entity.User;
import com.susan.domain.request.UserUpdateRequest;
import com.susan.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

public class MyPageController {
    private final UserService userService;

    public MyPageController(UserService userService) {
        this.userService = userService;
    }
    // 회원정보 수정
    // 내 주문 조회
    @GetMapping("/user/mypage")
    public ModelAndView userUpdatePage(ModelAndView mav,
                                       @RequestParam(value = "userId", required = false) String userId){
        User user = userService.findUser(userId);
        mav.addObject("user", user);
        mav.setViewName("/user/mypage");
        return mav;
    }


    @PostMapping("/user/mypage")
    public ModelAndView userUpdate(ModelAndView mav, HttpSession session,
                                   @RequestParam("password") String password,
                                   @RequestParam("username") String username,
                                   @RequestParam("address") String address,
                                   @RequestParam("phone") String phone
    ) {
        UserUpdateRequest request = new UserUpdateRequest("admin", password, username, address, phone);
        //UserUpdateRequest request = new UserUpdateRequest((String)session.getAttribute("id"), password, username, address, phone);
        int result = userService.userUpdate(request);

        if (result > 0)
            System.out.println("성공");
        else
            System.out.println("실패");

        // mav.addObject("user", user);
        mav.setViewName("redirect:/user/mypage?userId=admin");
        return mav;
    }
    //가게 사장일 경우 (권한이 2) 일경우만 노출되는 메뉴
    //상품 추가
    //가게 정보 등록
}
