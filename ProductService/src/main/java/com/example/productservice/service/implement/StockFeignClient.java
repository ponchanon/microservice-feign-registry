package com.example.productservice.service.implement;

import com.example.productservice.service.iStockFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockFeignClient implements iStockFeignClient {

    @Autowired
    iStockFeignClient stockFeignClient;

    @Override
    public int getStock(int productNumber) {
        return stockFeignClient.getStock(productNumber);
    }
}
