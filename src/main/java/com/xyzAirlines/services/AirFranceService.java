package com.xyzAirlines.services;

import com.xyzAirlines.model.Airplane;
import com.xyzAirlines.repository.AirFranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class AirFranceService {

    @Autowired
    public AirFranceRepository airFranceRepository;

    public Airplane create(Airplane newPlane) {
        System.out.println(newPlane);
        this.airFranceRepository.save(newPlane);
        return newPlane;
    }

    public Iterable<Airplane> list() {
        return this.airFranceRepository.findAll();

    }

    public Airplane findByID(long id) {
        Airplane result = this.airFranceRepository.findById(id).get();
        return result;
    }

    public Airplane updateByID(long id, Airplane update) {
        Airplane tobeUpdated = this.airFranceRepository.findById(id).get();
        tobeUpdated.setName(update.getName());
        tobeUpdated.setFuelLevel(update.getFuelLevel());
        return this.airFranceRepository.save(tobeUpdated);
    }

    public void deleteByID(long id) {

        this.airFranceRepository.deleteById(id);
    }


    public AirFranceRepository getAirFranceRepository() {
        return airFranceRepository;
    }

    public void setAirFranceRepository(AirFranceRepository airFranceRepository) {
        this.airFranceRepository = airFranceRepository;
    }

    public AirFranceService() {
    }
}
