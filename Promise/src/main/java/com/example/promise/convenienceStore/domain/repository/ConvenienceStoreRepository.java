package com.example.promise.convenienceStore.domain.repository;

import com.example.promise.convenienceStore.domain.ConvenienceStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ConvenienceStoreRepository extends JpaRepository<ConvenienceStore, Long> {


    @Query(value = "SELECT c.id, c.category, c.name, c.addressName, c.roadAddressName, c.phone, c.lat, c.lon "
            + "FROM ConvenienceStore c where c.lon between :lon - 0.0112688753 AND :lon + 0.0112688753"
            + "AND c.lat between :lat - 0.009094341 AND :lat + 0.009094341")
    List<ConvenienceStore> findNearByConvStores(@Param("lat")BigDecimal lat, @Param("lon")BigDecimal lon);

}