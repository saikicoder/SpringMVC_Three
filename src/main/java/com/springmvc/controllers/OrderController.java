package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @RequestMapping("/order")
    public String displayOrder(){

        return "order";
    }

    @RequestMapping("/sendOrder")
    //public String orderRequest(HttpServletRequest request,Model model){
    public String orderRequest(@RequestParam("customerName") String userName, @RequestParam("customerProduct") String userProduct, Model model){


        //handle the data received from user
        //String userName = request.getParameter("customerName");
        //String userProduct = request.getParameter("customerProduct");
        System.out.println("Order received");
        //adding captured values from user
        model.addAttribute("name",userName);
        model.addAttribute("product",userProduct);
        return "orderreceived";
    }

}
