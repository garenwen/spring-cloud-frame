package com.ucar.orderserver.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home(@RequestParam(value = "name",defaultValue = "manxiang.wen") String name){

        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String order(@RequestParam(value = "price") double price,@RequestParam(value = "product") String product,@RequestParam(value = "count") int count){


        System.out.print("product is "+ product + "price is "+price+"count is "+ count);
        return "successfully ordered";

    }
}
