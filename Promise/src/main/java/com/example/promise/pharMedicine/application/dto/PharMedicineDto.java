package com.example.promise.pharMedicine.application.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PharMedicineDto {
    private Long id;
    private String name;
    private String type;
    private String detailType;
    private String code;
}
