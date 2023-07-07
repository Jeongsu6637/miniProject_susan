package com.susan.controller;

import com.susan.domain.entity.User;
import com.susan.domain.request.IdFindRequest;
import com.susan.domain.request.LoginRequest;
import com.susan.domain.request.UserUpdateRequest;
import com.susan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    // GET 로그인 페이지
    @GetMapping("/user/login")
    public String getLoginPage() {
        return "/user/login";
    }

    // POST 로그인 페이지
    @PostMapping("/user/login")
    public ModelAndView postLogin(
            @RequestParam("id") String id,
            @RequestParam("password") String password,
            ModelAndView mav,
            HttpSession session
    ) {

        LoginRequest request = new LoginRequest(id, password);
        User login = userService.login(request);

        System.out.println(login);

        if(login!=null){
            session.setAttribute("id",login.getId());

            if
            (login.getIdType() == 1) {
                mav.setViewName("redirect:/front/main");
            } else if(login.getIdType() == 2) {
                mav.setViewName("redirect:/front/admin");
            }
        } else {
            // 로그인 실패 처리 로직
            mav.setViewName("redirect:/user/login");
        }
        return mav;
    }

    @GetMapping("/user/idfind")
    public String getIdFindPage() {
        return "/user/idfind";
    }

    @PostMapping("/user/idfind")
    public ModelAndView PostIdFind(@ModelAttribute IdFindRequest idFindRequest,
                                   ModelAndView mav,
                                   HttpSession session) {
        User idFind = userService.idFind(idFindRequest);
        System.out.println(idFind.getPhone());
        if (idFind != null) {
            System.out.println(idFind.getPhone());
            session.setAttribute("phone",idFind.getPhone());
            mav.addObject("id", idFind.getId());
            mav.addObject("pw", idFind.getPassword());
            mav.setViewName("/user/showloginfo");
        } else {
            mav.addObject("message", "등록된 회원이 아닙니다.");
            mav.setViewName("redirect:/user/idfind");
        }

        return mav;
    }


}


    //회원가입으로 이동

    //비밀번호, id 찾기

