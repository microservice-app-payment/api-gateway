package com.vn.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/orderServiceFallBack")
    @Timed(value = "orderServiceFallback.time",description = "Order service is down!")
    public String orderServiceFallback(){
        return "Order service is down!";
    }
    @Timed(value = "productServiceFallback.time",description = "Product service is down!")
    @GetMapping("/productServiceFallBack")
    public String productServiceFallback(){
        return "Product service is down!";
    }
    @Timed(value = "paymentServiceFallback.time",description = "Payment service is down!")
    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallback(){
        return "Payment service is down!";
    }
}
