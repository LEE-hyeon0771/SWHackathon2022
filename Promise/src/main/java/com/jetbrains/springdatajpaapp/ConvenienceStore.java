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


}
