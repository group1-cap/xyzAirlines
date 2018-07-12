package com.xyzAirlines.repository;

import com.xyzAirlines.model.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AirFranceRepository extends CrudRepository<Airplane, Long> {
}
