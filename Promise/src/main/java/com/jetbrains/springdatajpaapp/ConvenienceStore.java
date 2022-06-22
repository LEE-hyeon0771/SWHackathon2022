package com.jetbrains.springdatajpaapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ConvenienceStore {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;
    private String addressName;
    private String roadAddressName;
    private Float lat;
    private Float lon;
    private List<ConvMedicine> convMedicines;

    public ConvenienceStore() {
    }

    public ConvenienceStore(Long id, String name, String phone, String addressName, String roadAddressName, Float lat, Float lon, List<ConvMedicine> convMedicines) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addressName = addressName;
        this.roadAddressName = roadAddressName;
        this.lat = lat;
        this.lon = lon;
        this.convMedicines = convMedicines;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getRoadAddressName() {
        return roadAddressName;
    }

    public void setRoadAddressName(String roadAddressName) {
        this.roadAddressName = roadAddressName;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public List<ConvMedicine> getConvMedicines() {
        return convMedicines;
    }

    public void setConvMedicines(List<ConvMedicine> convMedicines) {
        this.convMedicines = convMedicines;
    }

    @Override
    public String toString() {
        return "ConvenienceStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", addressName='" + addressName + '\'' +
                ", roadAddressName='" + roadAddressName + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", convMedicines=" + convMedicines +
                '}';
    }
}
