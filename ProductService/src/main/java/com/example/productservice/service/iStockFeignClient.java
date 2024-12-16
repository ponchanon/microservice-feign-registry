package com.example.productservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("STOCKSERVICE")
public interface iStockFeignClient {
    @RequestMapping("stock/{productNumber}")
    public int getStock(@PathVariable("productNumber") int productNumber);
}
