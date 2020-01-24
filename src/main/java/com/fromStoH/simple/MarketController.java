package com.fromStoH.simple;

import com.fromStoH.simple.market.Market;
import com.fromStoH.simple.market.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketController {

    @Autowired
    MarketService marketService;

    @GetMapping("/markets")
    private List<Market> getAllMarket() {
        return marketService.getAllMarkets();
    }

    @GetMapping("/markets/{id}")
    private Market getMarket(@PathVariable("id") int id) {
        return marketService.getMarketById(id);
    }

    @DeleteMapping("/markets/{id}")
    private void deleteMarket(@PathVariable("id") int id) {
        marketService.delete(id);
    }

    @PostMapping("/markets")
    private int saveMarket(@RequestBody Market market) {
        marketService.saveOrUpdate(market);
        return market.getId();
    }
}