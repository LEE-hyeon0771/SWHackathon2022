package com.example.promise.convenienceStore.presentation;

import com.example.promise.convenienceStore.application.ConvenienceStoreService;
import com.example.promise.convenienceStore.application.dto.ConvenienceStoreDto;
import com.example.promise.convenienceStore.presentation.request.ConvenienceStoreRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/convenience")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ConvenienceStoreController {
    private final ConvenienceStoreService convenienceStoreService;

    @GetMapping("/all")
    public ResponseEntity<List<ConvenienceStoreDto>> getConvenienceStore() {
        List<ConvenienceStoreDto> response = convenienceStoreService.getConvenienceStores();

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ConvenienceStoreDto>> getNearByConvenienceStore(@RequestParam BigDecimal lat, @RequestParam BigDecimal lon) {
        List<ConvenienceStoreDto> response = convenienceStoreService.getNearByConvenienceStores(lat, lon);

        return ResponseEntity.ok(response);
    }

}
