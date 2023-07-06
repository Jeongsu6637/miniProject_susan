package com.susan.controller;

import com.susan.domain.request.SignupRequest;
import com.susan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
// id, pw
// 이름
// 타입(사장인지, 일반유저인지) 관리자 계정은 따로 만들거임
// e-mail
// phone
// address

// 회원가입 시 admin을 입력하면 다른 아이디를 입력해주세요.
@Controller
@RequestMapping("/user")
public class SignupController {
    private final UserService userService;

    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String getSignup() {
        //model.addAttribute("signupRequest", new SignupRequest());
        System.out.println("확인용");
        return "/user/signup";
    }

//    @PostMapping("/signup")
//    public ModelAndView signup(
//            @ModelAttribute("signupRequest") SignupRequest signupRequest,
//            ModelAndView mav
//    ) {
//        if (userService.signupAsUser(signupRequest)) {
//            // 회원가입 성공시
//            mav.setViewName("redirect:/user/login");
//        } else {
//            // 회원가입 실패시
//            mav.setViewName("redirect:/user/signup");
//        }
//        return mav;
//    }

    // 유저 회원가입
    @PostMapping("/signup")
    public ModelAndView signupAsUser(@ModelAttribute SignupRequest signupRequest, ModelAndView mav) {
//        if (userService.signupAsUser(signupRequest)) {
//            mav.setViewName("redirect:/user/login");
//        } else {
//            mav.setViewName("redirect:/user/signup");
//        }

//        System.out.println(signupRequest.getId());
//        System.out.println(signupRequest.getName());
//        System.out.println(signupRequest.getAddress());
//
//        signupRequest.setIdType(2);

        // 디버그 해봐서 여기서 멈추는지 확인

        String reqId = userService.equalCheck(signupRequest.getId());

        if (reqId == null || reqId.equals("")) {
            if (userService.signup(signupRequest))
                mav.setViewName("redirect:/user/login");
            else
                mav.setViewName("redirect:/user/signup");
        } else {
            System.out.println("아쉽");
            mav.setViewName("redirect:/user/signup");
        }


//        System.out.println(signupRequest.getId());
//        System.out.println(reqId);
//        if (signupRequest.getId().equals(reqId)) {
//            userService.signup(signupRequest);
//            mav.setViewName("redirect:/user/login");
//        }else {
//            mav.setViewName("redirect:/user/signup");
//        }

        return mav;
    }

    // 사업자 회원가입
//    private ModelAndView signupAsAdmin(SignupRequest signupRequest, ModelAndView mav) {
//        if (userService.signupAsAdmin(signupRequest)) {
//            mav.setViewName("redirect:/user/login");
//        } else {
//            mav.setViewName("redirect:/user/signup2");
//        }
//        return mav;
//    }
    @GetMapping("/signup2")
    public String getSignup2() {
        //model.addAttribute("signupRequest", new SignupRequest());
        System.out.println("확인용");
        return "/user/signup2";
    }

    @PostMapping("/signup2")
    public ModelAndView signupAsCeo(@ModelAttribute SignupRequest signupRequest,
                                    ModelAndView mav) {
        String reqId = userService.equalCheck(signupRequest.getId());

        if (reqId == null || reqId.equals("")) {
            if (userService.signupAsAdmin(signupRequest))
                mav.setViewName("redirect:/user/login");
            else
                mav.setViewName("redirect:/user/signup2");
        } else {
            System.out.println("아쉽");
            mav.setViewName("redirect:/user/signup2");
        }return mav;
    }
}