package com.example.promise.pharmacy.application.dto;

import com.example.promise.pharMedicine.application.dto.PharMedicineDto;
import com.example.promise.pharmacy.domain.time.Time;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PharmacyDto {
    private int id;
    private int category;
    private String name;
    private String phone;
    private String addressName;
    private String roadAddressName;
    private BigDecimal lat;
    private BigDecimal lon;
    private List<PharMedicineDto> medicines;
    private Time time;
}


