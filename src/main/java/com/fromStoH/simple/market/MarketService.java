package com.fromStoH.simple.market;

import com.fromStoH.simple.market.Market;
import com.fromStoH.simple.market.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarketService {

    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAllMarkets() {
        List<Market> markets = new ArrayList<Market>();
        marketRepository.findAll().forEach(markets::add);
        return markets;
    }

    public Market getMarketById(int id) {
        return marketRepository.findById(id).get();
    }

    public void saveOrUpdate(Market market) {

        marketRepository.save(market);
    }

    public void delete(int id) {
        marketRepository.deleteById(id);
    }
}