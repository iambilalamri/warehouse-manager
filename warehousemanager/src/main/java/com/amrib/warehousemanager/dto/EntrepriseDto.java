package com.amrib.warehousemanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String email;

    private String numTelephone;

    private String siteWeb;

    private String photo;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;
}
