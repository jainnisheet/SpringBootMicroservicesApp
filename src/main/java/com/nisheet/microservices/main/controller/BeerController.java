package com.nisheet.microservices.main.controller;

import com.nisheet.microservices.main.entities.Beer;
import com.nisheet.microservices.main.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService service){
        beerService = service;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<Beer> getBeer(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody Beer beer){
        beerService.createBeer(beer);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateBeer(@PathVariable UUID id, @RequestBody Beer beer){
        beerService.updateBeer(id, beer);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBeer(@PathVariable UUID id){
        beerService.deleteBeer(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
