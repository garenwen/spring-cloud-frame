package com.ucar.feignserver.web;

import com.ucar.feignserver.service.SchedulerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyController {

    @Autowired
    SchedulerOrderService schedulerOrderService;

    @GetMapping(value = "/buy")
    public String buy(@RequestParam(value = "price") double price,@RequestParam(value = "product") String product,@RequestParam(value = "count") int count) {
        return schedulerOrderService.buyFromClientOne( price, product, count);
    }
}
