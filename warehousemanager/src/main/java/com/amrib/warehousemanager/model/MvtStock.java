package com.amrib.warehousemanager.model;

import com.amrib.warehousemanager.enums.TypeMvtStock;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvtstock")
public class MvtStock extends AbstractEntity {

    @Column(name = "dateMvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @Column(name = "typeMvtStock")
    private TypeMvtStock typeMvtStock;
}
