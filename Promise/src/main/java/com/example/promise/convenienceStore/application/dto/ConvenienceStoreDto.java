package com.example.promise.convenienceStore.application.dto;

import com.example.promise.convMedicine.application.dto.ConvMedicineDto;
import com.example.promise.convenienceStore.domain.ConvenienceStore;
import lombok.*;

import javax.swing.text.IconView;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConvenienceStoreDto {
    private int id;
    private int category;
    private String name;
    private String phone;
    private String addressName;
    private String roadAddressName;
    private BigDecimal lat;
    private BigDecimal lon;


    public ConvenienceStoreDto(int id, int category, String name, ConvenienceStore convenienceStore, String phone, String addressName, String roadAddressName, BigDecimal lat, BigDecimal lon) {
        this.id = id;
        this.category = category;
        this.phone = phone;
        this.addressName = addressName;
        this.roadAddressName = roadAddressName;
        this.lat = lat;
        this.lon = lon;

    }
}
