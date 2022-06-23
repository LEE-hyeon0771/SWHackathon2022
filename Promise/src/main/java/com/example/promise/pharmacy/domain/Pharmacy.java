package com.example.promise.pharmacy.domain;

import com.example.promise.pharMedicine.domain.pharManage.PharManage;
import com.example.promise.pharmacy.domain.time.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE pharmacy SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Pharmacy {
    @Id
    @GeneratedValue
    private int id;
    private int category;
    private String name;
    private String phone;
    private String addressName;
    private String roadAddressName;
    private BigDecimal lat;
    private BigDecimal lon;

    @OneToMany(mappedBy = "pharmacy")
    private List<PharManage> pharManages = new ArrayList<>();

    @OneToOne
    private Time time;
}
