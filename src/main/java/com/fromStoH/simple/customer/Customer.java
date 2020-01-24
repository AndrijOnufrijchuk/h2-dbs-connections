package com.fromStoH.simple.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fromStoH.simple.market.Market;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    //@Autowired
   // MarketRepository marketRepository;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    //@JoinColumn(name = "market_id")
    private Market market;


    public int getMarket() {

        return market.getId();
    }
//return marketRepository.findById(id).get(id);

    public void setMarket(Market market) {
        this.market = market;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
