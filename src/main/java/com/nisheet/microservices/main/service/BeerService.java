package com.nisheet.microservices.main.service;

import com.nisheet.microservices.main.entities.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID beerId);

    void createBeer(Beer beer);

    void updateBeer(UUID id, Beer beer);

    void deleteBeer(UUID id);
}
