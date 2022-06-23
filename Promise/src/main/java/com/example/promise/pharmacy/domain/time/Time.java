package com.example.promise.pharmacy.domain.time;

import com.example.promise.pharmacy.domain.Pharmacy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE time SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Time {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne(mappedBy="time")
    private Pharmacy pharmacy;

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
}
