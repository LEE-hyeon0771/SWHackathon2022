package com.example.promise.convenienceStore.domain;

import com.example.promise.convMedicine.application.dto.ConvMedicineDto;
import com.example.promise.convMedicine.domain.convManage.ConvManage;
import com.example.promise.convenienceStore.application.dto.ConvenienceStoreDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    public ConvenienceStoreDto toCovenienceStoreDto() {
        return new ConvenienceStoreDto(this.id, this.category, this.name, this,phone, this.addressName, this.roadAddressName, this.lat, this.lon);

    }
}
