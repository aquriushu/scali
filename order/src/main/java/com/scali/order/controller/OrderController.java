package com.scali.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/add")
    public String add() {
        System.out.println("添加成功！");
        return "OrderController_add()_invoke. ";
    }

}
