package com.example.promise.convenienceStore.application;

import com.example.promise.convenienceStore.application.dto.ConvenienceStoreDto;
import com.example.promise.convenienceStore.domain.ConvenienceStore;
import com.example.promise.convenienceStore.domain.repository.ConvenienceStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ConvenienceStoreService {
    private final ConvenienceStoreRepository convenienceStoreRepository;

    @Transactional
    public List<ConvenienceStoreDto> getConvenienceStores(){
        List<ConvenienceStore> convStores = convenienceStoreRepository.findAll();
        List<ConvenienceStoreDto> convStoresDtos = new ArrayList<>();
        for (ConvenienceStore convStore : convStores) {
            convStoresDtos.add(convStore.toCovenienceStoreDto());
        }

        return convStoresDtos;
    }

    @Transactional
    public List<ConvenienceStoreDto> getNearByConvenienceStores(BigDecimal lat, BigDecimal lon){
        List<ConvenienceStore> convStores = convenienceStoreRepository.findNearByConvStores(lat, lon);
        List<ConvenienceStoreDto> convStoresDtos = new ArrayList<>();
        for (ConvenienceStore convStore : convStores) {
            convStoresDtos.add(convStore.toCovenienceStoreDto());
        }

        return convStoresDtos;
    }
}
