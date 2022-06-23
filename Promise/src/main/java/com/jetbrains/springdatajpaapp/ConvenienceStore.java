package com.jetbrains.springdatajpaapp;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class ConvenienceStore {
    @Id
    @GeneratedValue
    private int id;
    private int category;
    private String name;
    private String phone;
    private String addressName;
    private String roadAddressName;
    private Float lat;
    private Float lon;

    @ManyToMany
    @JoinTable(
            name = "ConvManage",
            joinColumns = @JoinColumn(name = "conv"),
            inverseJoinColumns = @JoinColumn(name = "convMedicine")
    )
    Set<ConvMedicine> managedConvMedicines;


}
