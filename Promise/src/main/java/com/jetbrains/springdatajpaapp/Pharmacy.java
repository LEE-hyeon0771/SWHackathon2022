package com.jetbrains.springdatajpaapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Pharmacy {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;
    private String addressName;
    private String roadAddressName;
    private Float lat;
    private Float lon;
    private List<PharMedicine> pharMedicines;

    public Pharmacy() {
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }


}
