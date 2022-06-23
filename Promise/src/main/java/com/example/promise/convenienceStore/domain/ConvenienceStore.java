package com.example.promise.convenienceStore.domain;

import com.example.promise.convMedicine.domain.convManage.ConvManage;
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
@SQLDelete(sql = "UPDATE convenienceStore SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class ConvenienceStore {
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
    @OneToMany(mappedBy = "convenienceStore")
    private List<ConvManage> convManages = new ArrayList<>();
}
