package com.amrib.warehousemanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto addresse;

    private String photo;

    private String email;

    private String numTelephone;

    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseurs;
}
