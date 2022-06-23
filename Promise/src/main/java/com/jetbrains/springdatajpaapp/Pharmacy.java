package com.jetbrains.springdatajpaapp;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(schema = "Promise", name = "Pharmacy")
public class Pharmacy {
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

    @OneToOne
    @JoinColumn(name = "id")
    private Time time;

    @ManyToMany
    @JoinTable(
            name = "PharManage",
            joinColumns = @JoinColumn(name = "phar"),
            inverseJoinColumns = @JoinColumn(name = "pharMedicine")
    )
    Set<PharMedicine> managedPharMedicines;
}
