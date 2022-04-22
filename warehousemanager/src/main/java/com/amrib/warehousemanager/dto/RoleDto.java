package com.amrib.warehousemanager.dto;

import com.amrib.warehousemanager.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;
}
