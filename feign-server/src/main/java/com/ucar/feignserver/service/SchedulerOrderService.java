package com.ucar.feignserver.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(value = "order-server")
public interface SchedulerOrderService {
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    String buyFromClientOne(@RequestParam(value = "price") double price,@RequestParam(value = "product") String product,@RequestParam(value = "count") int count);
}
