package com.amrib.warehousemanager.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity {

    @Column(name = "codeArticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixUnitaireHT")
    private BigDecimal prixUnitaireHT;

    @Column(name = "tauxTVA")
    private BigDecimal tauxTVA;

    @Column(name = "prixUnitaireTTC")
    private BigDecimal prixUnitaireTTC;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;
}
