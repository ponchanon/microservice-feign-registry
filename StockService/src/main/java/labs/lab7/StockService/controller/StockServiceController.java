package labs.lab7.StockService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockServiceController {
    @GetMapping("/{productNumber}")
    public int getStock(@PathVariable int productNumber) {
        return 90;
    }
}
