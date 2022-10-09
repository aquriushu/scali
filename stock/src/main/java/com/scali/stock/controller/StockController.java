package com.scali.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @GetMapping("/getStock")
    public String getStock() {
        System.out.println("获取库存成功！");
        return "StockController_getStock()_invoke. ";
    }

}
