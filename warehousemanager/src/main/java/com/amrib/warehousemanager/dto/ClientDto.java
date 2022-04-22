package com.amrib.warehousemanager.dto;

import com.amrib.warehousemanager.model.Adresse;
import com.amrib.warehousemanager.model.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Builder
@Data
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto addresse;

    private String photo;

    private String email;

    private String numTelephone;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client) {
        if (Objects.isNull(client)) {
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .email(client.getEmail())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .addresse(AdresseDto.builder()
                        .adresse1(client.getAddresse().getAdresse1())
                        .adresse2(client.getAddresse().getAdresse2())
                        .codePostale(client.getAddresse().getCodePostale())
                        .ville(client.getAddresse().getVille())
                        .pays(client.getAddresse().getPays())
                        .build())
                .numTelephone(client.getNumTelephone())
                .photo(client.getPhoto())
                .build();
    }

    public static Client toEntity(ClientDto clientDto) {
        if (Objects.isNull(clientDto)) {
            return null;
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setEmail(clientDto.getEmail());
        client.setNumTelephone(clientDto.getNumTelephone());
        client.setPhoto(clientDto.getPhoto());
        client.setAddresse(Adresse.builder()
                .adresse1(clientDto.getAddresse().getAdresse1())
                .adresse2(clientDto.getAddresse().getAdresse2())
                .codePostale(clientDto.getAddresse().getCodePostale())
                .ville(clientDto.getAddresse().getVille())
                .pays(clientDto.getAddresse().getPays())
                .build());
        return client;
    }
}
