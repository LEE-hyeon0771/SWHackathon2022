package com.jetbrains.springdatajpaapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

@Entity
public class ConvMedicine {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany(mappedBy = "managedConvMedicines")
    Set<ConvenienceStore> manages;
    private String name;
    private String type;
    private String detailType;
    private String code;

    public ConvMedicine() {
    }

}
