package com.example.promise.convMedicine.domain;

import com.example.promise.convMedicine.domain.convManage.ConvManage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ConvMedicine {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private String detailType;
    private String code;

    @OneToMany(mappedBy = "convenienceStore")
    private List<ConvManage> convManages = new ArrayList<>();


}
