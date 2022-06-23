package com.example.promise.convenienceStore.application.dto;

import com.example.promise.convMedicine.application.dto.ConvMedicineDto;
import lombok.*;
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
    private List<ConvMedicineDto> medicines;

}
