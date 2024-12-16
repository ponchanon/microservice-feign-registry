package com.example.productservice.controller;

import com.example.productservice.domain.Product;
import com.example.productservice.service.implement.StockFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    public final StockFeignClient stockFeignClient;

    @GetMapping("/{productNumber}")
    public Product getProduct(@PathVariable("productNumber") int productNumber) {
        return new Product(productNumber, "Dummy Product", stockFeignClient.getStock(productNumber));
    }
}
