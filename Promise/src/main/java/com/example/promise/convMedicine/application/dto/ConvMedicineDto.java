package com.example.promise.convMedicine.application.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConvMedicineDto {
    private Long id;
    private String name;
    private String type;
    private String detailType;
    private String code;
}
