package com.amrib.warehousemanager.dto;

import com.amrib.warehousemanager.enums.TypeMvtStock;
import com.amrib.warehousemanager.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStockDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStock typeMvtStock;
}
