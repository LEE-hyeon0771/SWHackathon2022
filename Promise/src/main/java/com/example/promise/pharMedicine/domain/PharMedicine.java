package com.example.promise.pharMedicine.domain;

import com.example.promise.pharMedicine.domain.pharManage.PharManage;
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
@SQLDelete(sql = "UPDATE pharMedicine SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class PharMedicine {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private String detailType;
    private String code;

    @OneToMany(mappedBy = "pharmacy")
    private List<PharManage> phatManages = new ArrayList<>();


}
