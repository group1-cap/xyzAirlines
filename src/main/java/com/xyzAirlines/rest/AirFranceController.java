package com.xyzAirlines.rest;

import com.xyzAirlines.services.AirFranceService;
import com.xyzAirlines.model.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/planes")
public class AirFranceController {

    @Autowired
    private AirFranceService airFranceService;

    @PostMapping
    public ResponseEntity<Airplane> create(@RequestBody Airplane newPlane){
        this.airFranceService.create(newPlane);
        return new ResponseEntity<Airplane>(newPlane, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Airplane> list(){
        return this.airFranceService.list();
    }

    @GetMapping("{id}")
    public Airplane findById(@PathVariable long id){
    return this.airFranceService.findByID(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {
        this.airFranceService.deleteByID(id);
    }


    @PutMapping(value = "{id}")
    public Airplane updateByID(@PathVariable long id, @RequestBody Airplane update){
        return this.airFranceService.updateByID(id, update);
    }

    public AirFranceService getAirFranceService() {
        return airFranceService;
    }

    public void setAirFranceService(AirFranceService airFranceService) {
        this.airFranceService = airFranceService;
    }

    public AirFranceController() {
    }
}
