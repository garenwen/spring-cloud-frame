package com.ucar.feignserver.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class SchedulerOrderServiceHystrix implements SchedulerOrderService {


    @Override
    public String buyFromClientOne(@RequestParam(value = "price") double price, @RequestParam(value = "product") String product, @RequestParam(value = "count") int count) {
        return "this is fail";
    }
}
