package com.xyzAirlines.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Airplane implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double fuelLevel;

    @ManyToOne
    private Airport airport;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Airplane() {
        ;
    }
    public Airplane(String name) {
        this.name = name;
    }
}
