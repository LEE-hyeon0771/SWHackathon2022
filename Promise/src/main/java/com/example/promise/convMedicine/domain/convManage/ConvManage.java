package com.example.promise.convMedicine.domain.convManage;

import com.example.promise.convMedicine.domain.ConvMedicine;
import com.example.promise.convenienceStore.domain.ConvenienceStore;
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
@SQLDelete(sql = "UPDATE convManage SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class ConvManage {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private String detailType;
    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    private ConvMedicine convMedicine;

    @ManyToOne(fetch = FetchType.LAZY)
    private ConvenienceStore convenienceStore;


}
