package com.fromStoH.simple.market;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends CrudRepository<Market, Integer> {
}
