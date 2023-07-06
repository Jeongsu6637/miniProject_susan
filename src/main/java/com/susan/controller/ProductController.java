package com.susan.controller;


import com.susan.domain.request.ProductInsertRequest;
import com.susan.domain.request.ProductUpdateRequest;
import com.susan.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * GetMapping : 물건 삽입하는 요청
     * @return
     */
    @GetMapping("/insert")
    public String inProduct(){
        return "/product/product";
    }

    /**
     * PostMapping: 물건 삽입을 처리하는 요청
     * @param ProductInsertRequest
     * @return 아직 미정
     */
    @PostMapping("/insert")
    @ResponseBody
    public String insertProduct(@ModelAttribute ProductInsertRequest p){

        System.out.println(p.getName());
        System.out.println(p.getCategory());
        productService.insertProduct(p);
        return "insert test";
    }


    /**
     * 물품 업데이트 화면  Parameter로 seq를 받아와야함
     * @param seq
     * @param mav
     * @return
     */
    @GetMapping("/update")
    public ModelAndView insertProduct(@RequestParam() String seq, ModelAndView mav){

        mav.addObject("seq",seq);
        mav.setViewName("/product/productUpdate");
        return mav;
    }


    /**
     * 물품 업데이트 처리화면
     * @param p
     * @return 경로는 아직 미정
     */
    @PostMapping("/update")
    @ResponseBody
    public String UpdateProduct(@ModelAttribute ProductUpdateRequest p){

        System.out.println(p.getSeq());
        System.out.println(p.getName());
        System.out.println(p.getCategory());
        productService.updateProduct(p);
        return "Update test";
    }

    /**
     * 물품 삭제 처리 기능
     *
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public String deleteProduct(@RequestParam("seq") int seq){

        productService.deleteProduct(seq);

        return "Update test";
    }

}
