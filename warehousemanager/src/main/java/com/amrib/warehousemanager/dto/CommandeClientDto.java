package com.amrib.warehousemanager.dto;

import com.amrib.warehousemanager.model.Adresse;
import com.amrib.warehousemanager.model.Client;
import com.amrib.warehousemanager.model.CommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Builder
@Data
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private Client client;

    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClients;

    public static CommandeClient fromEntity(CommandeClientDto commandeClientDto){
        if(Objects.isNull(commandeClientDto)){
            return null;
        }
        Client client = new Client();
        client.setId(commandeClientDto.getClient().getId());
        client.setNom(commandeClientDto.getClient().getNom());
        client.setPrenom(commandeClientDto.getClient().getPrenom());
        client.setEmail(commandeClientDto.getClient().getEmail());
        client.setPhoto(commandeClientDto.getClient().getPhoto());
        client.setNumTelephone(commandeClientDto.getClient().getNumTelephone());
        client.setAddresse(Adresse.builder()
                .adresse1(commandeClientDto.getClient().getAddresse().getAdresse1())
                .adresse2(commandeClientDto.getClient().getAddresse().getAdresse2())
                .codePostale(commandeClientDto.getClient().getAddresse().getCodePostale())
                .ville(commandeClientDto.getClient().getAddresse().getVille())
                .pays(commandeClientDto.getClient().getAddresse().getPays())
                .build());

        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        commandeClient.setClient(client);

        return commandeClient;
    }
}
