package com.fromStoH.simple.customer;

import com.fromStoH.simple.market.Market;
import com.fromStoH.simple.market.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerCreationRequest {
    @Autowired
    MarketRepository marketRepository;
    private String name;
    private int age;
    private Market market;

    public Market getMarket() {
        return market;
    }

    public void setMarket(int id2) {
        marketRepository.findById(id2).get();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
