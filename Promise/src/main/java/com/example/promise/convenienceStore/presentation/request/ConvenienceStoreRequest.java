package com.example.promise.convenienceStore.presentation.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class ConvenienceStoreRequest {
    private BigDecimal lat;
    private BigDecimal lon;
}