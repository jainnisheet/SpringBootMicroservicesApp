package com.nisheet.microservices.main.service;

import com.nisheet.microservices.main.entities.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public Beer getBeerById(UUID beerId) {
        return Beer.builder().id(beerId)
                .beerName("Beera")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public void createBeer(Beer beer) {
        Beer.builder().id(UUID.randomUUID())
                .beerName(beer.getBeerName())
                .beerStyle(beer.getBeerStyle())
                .upc(beer.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID id, Beer beer) {

    }
    @Override
    public void deleteBeer(UUID id) {

    }
}
