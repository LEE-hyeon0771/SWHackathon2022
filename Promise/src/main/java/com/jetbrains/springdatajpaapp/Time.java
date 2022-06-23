package com.jetbrains.springdatajpaapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Time {
    @Id
    private long id;

    @OneToOne(mappedBy = "id")
    private Pharmacy phar;

    private String mon_start;
    private String mon_end;
    private String tue_start;
    private String tue_end;
    private String wed_start;
    private String wed_end;
    private String thu_start;
    private String thu_end;
    private String fri_start;
    private String fri_end;
    private String sat_start;
    private String sat_end;
    private String sun_start;
    private String sun_end;
    private String hol_start;
    private String hol_end;

    public Time() {
    }

    public String getMon_start() {
        return mon_start;
    }

    public String getMon_end() {
        return mon_end;
    }

    public String getTue_start() {
        return tue_start;
    }

    public String getTue_end() {
        return tue_end;
    }

    public String getWed_start() {
        return wed_start;
    }

    public String getWed_end() {
        return wed_end;
    }

    public long getId() {
        return id;
    }

    public String getThu_start() {
        return thu_start;
    }

    public String getThu_end() {
        return thu_end;
    }

    public String getFri_start() {
        return fri_start;
    }

    public String getFri_end() {
        return fri_end;
    }

    public String getSat_start() {
        return sat_start;
    }

    public String getSat_end() {
        return sat_end;
    }

    public String getSun__start() {
        return sun_start;
    }

    public String getSun_end() {
        return sun_end;
    }

    public String getHol_start() {
        return hol_start;
    }

    public String getHol_end() {
        return hol_end;
    }
}
