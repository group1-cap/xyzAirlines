package com.xyzAirlines.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "airport")
    private Set<Airplane> airplanes = new HashSet<>();
}
