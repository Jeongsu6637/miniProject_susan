package com.susan.controller;

import com.susan.domain.entity.Cart;
import com.susan.domain.entity.Menu;
import com.susan.domain.entity.MyCart;
import com.susan.domain.entity.Store;
import com.susan.domain.request.CartRequest;
import com.susan.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        /*1번..
        * /main/store 로 주소창을 접속시 이쪽으로 온다..
        *
        * */

        // 모든 상점의 리스트를 조회해서 변수에 담았다..
        List<Store> allStore = storeService.findAllStore();

        // 화면으로 stores 라는 변수에다 방금 모든 상점의 리스트를 보내줬다. 한번 가볼까 ? stores.jsp로..
        mav.addObject("stores", allStore);

        // 리스트를 보내고 /user/store 라는 jsp를 보여줬다.
        mav.setViewName("/user/store");
        return mav;
    }


    @GetMapping("/menu")
    public ModelAndView storeMenu(@RequestParam int store_seq, ModelAndView mav){
        /*4번
        * 아까 store.jsp 에서 상점으로 가기를 눌렀을 때 같이 파라미터로 보내준 store_seq를 여기서 받고있구나..
        *
        * */

        // 아까 store.jsp 에서 받아온 store_seq를 기준으로 해당하는 상점의 모든 메뉴를 가져온다.
        List<Menu> allMenu = storeService.findAllMenu(store_seq);

        // 해당하는 상점의 모든 메뉴를 menulist 라는 변수에 담아서 /user/menu.jsp에 보내줬다.
        mav.addObject("menulist",allMenu);

        // 아까 store.jsp 에서 상점으로 가기를 눌렀을 때 보내준 store_seq 를 store_req 라는 변수로 담아서  /user/menu.jsp에 보내줬다.
        mav.addObject("store_req", store_seq);

        // 화면은 /user/menu.jsp 를 보여줬다.
        // 그럼 menu.jsp 로 가보자!!!
        mav.setViewName("/user/menu");

        return mav;
    }

    @PostMapping("/menu/{store_req}/{menuseq}")
    public ModelAndView addCart(@PathVariable("store_req") int store_seq, @PathVariable("menuseq") int menuseq, ModelAndView mav){
        /*7번
        * 아까 menu.jsp 에서 장바구니 추가를 눌렀을때 store_seq(상점의 고유번호)를 받아왔고 menuseq (메뉴의 고유번호)를 받아왔기 때문에
        * 여기서 파라미터로 받을 수 있다.
        * */

        // 요청용 객체 CartRequest를 만들어준다.
        CartRequest request = new CartRequest();

        // CartRequest 에 user_seq 를 담는다 (여기서는 로그인 기능이 아직 완료되지 않았기 때문에 임의로 1로 하였음)
        request.setUser_seq(1);

        // CartRequest 에 store_seq(상점고유번호)를 담는다.
        request.setStore_seq(store_seq);

        // CartRequest 에 menuseq(메뉴 고유번호)를 담는다.
        request.setProduct_seq(menuseq);

        // 다 만들어진 CartRequest를 가지고 장바구니에 추가하는 로직을 태워 보내자!
        int result = storeService.insertcart(request);

        // 정상적으로 추가 될 시 1이 나올거임..
        System.out.println("///////////////////");
        System.out.println("내 장바구니에 정상적으로 들어갔다면 1이 나올거임 제발 -> " + result);

        // -  /main/menu 로 주소창을 변경

        // /main/cart 로 들어가서 내 장바구니 리스트 노출시켜보자 바로 아래있네? 가보자
        mav.setViewName("redirect:/main/menu?store_seq=" + store_seq);
        return mav;
    }

    @GetMapping("/cart")
    public ModelAndView AllCart(ModelAndView mav){
        /*
        * 8번
        * */

        // 내 장바구니 리스트를 전부 보여주는 로직인데 아직 회원가입이 없어서 일단 user_seq를 1로 해놓음.
        List<MyCart> cartList = storeService.AllCart(1);

        // 내 장바구니 리스트를 cartlist 라는 변수로 담아서 /main/cart.jsp 보내줌!
        mav.addObject("cartlist",cartList);

        // 값을 잘 나타내는지 /main/cart.jsp 로 가보자!
        mav.setViewName("/main/cart");
        return mav;
    }

}
