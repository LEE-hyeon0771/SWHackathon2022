package com.jetbrains.springdatajpaapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

@Entity
public class PharMedicine {

    @Id
    @GeneratedValue
    private int id;
    @ManyToMany(mappedBy = "managedPharMedicines")
    Set<Pharmacy> manages;
    private String name;
    private String type;
    private String detailType;
    private String code;

    public PharMedicine() {
    }

}
