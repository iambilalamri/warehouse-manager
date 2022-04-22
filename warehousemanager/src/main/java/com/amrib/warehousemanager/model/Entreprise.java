package com.amrib.warehousemanager.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Embedded
    private Adresse adresse;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "email")
    private String email;

    @Column(name = "numTelephone")
    private String numTelephone;

    @Column(name = "siteWeb")
    private String siteWeb;

    @Column(name = "photo")
    private String photo;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;

}
