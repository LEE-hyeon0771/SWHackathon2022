package com.example.promise.pharMedicine.domain.pharManage;

import com.example.promise.convenienceStore.domain.ConvenienceStore;
import com.example.promise.pharMedicine.domain.PharMedicine;
import com.example.promise.pharmacy.domain.Pharmacy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE pharManage SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class PharManage {
    @Id
    @GeneratedValue
    private Long id;

    private Long stockNum;

    @ManyToOne(fetch = FetchType.LAZY)
    private PharMedicine pharMedicine;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pharmacy pharmacy;


}
