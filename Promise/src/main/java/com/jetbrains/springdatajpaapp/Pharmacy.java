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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getRoadAddressName() {
        return roadAddressName;
    }

    public List<PharMedicine> getPharMedicines() {
        return pharMedicines;
    }

    public void setCoordinates(Float lat, Float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", addressName='" + addressName + '\'' +
                ", roadAddressName='" + roadAddressName + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", pharMedicines=" + pharMedicines +
                '}';
    }
}
