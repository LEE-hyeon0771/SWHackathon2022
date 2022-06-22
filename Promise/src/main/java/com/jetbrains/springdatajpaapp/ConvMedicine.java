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

    public ConvMedicine() {
    }

    public ConvMedicine(Long id, ConvenienceStore conv, String name, String type, String detailType, String code, int stockNum) {
        this.id = id;
        this.conv = conv;
        this.name = name;
        this.type = type;
        this.detailType = detailType;
        this.code = code;
        this.stockNum = stockNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConvenienceStore getConv() {
        return conv;
    }

    public void setConv(ConvenienceStore conv) {
        this.conv = conv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    @Override
    public String toString() {
        return "ConvMedicine{" +
                "id=" + id +
                ", conv=" + conv +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", detailType='" + detailType + '\'' +
                ", code='" + code + '\'' +
                ", stockNum=" + stockNum +
                '}';
    }
}
