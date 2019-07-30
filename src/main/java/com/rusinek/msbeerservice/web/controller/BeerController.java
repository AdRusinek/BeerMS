package com.rusinek.msbeerservice.web.controller;

import com.rusinek.msbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Adrian Rusinek on 31.07.2019
 **/
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveNewBeer(@RequestBody BeerDto beerDto) {
        //todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<?> updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
