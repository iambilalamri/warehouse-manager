package com.amrib.warehousemanager.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {

    private Integer id;

    private VenteDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
