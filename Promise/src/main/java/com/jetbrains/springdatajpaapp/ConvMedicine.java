package com.jetbrains.springdatajpaapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ConvMedicine {

    @Id
    @GeneratedValue
    private Long id;
    private ConvenienceStore conv;
    private String name;
    private String type;
    private String detailType;
    private String code;
    private int stockNum;

}
