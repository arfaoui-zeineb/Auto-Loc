package tn.esprit.auto_loc.service;

import org.mapstruct.Mapper;
import tn.esprit.auto_loc.DTO.ClientDTO;
import tn.esprit.auto_loc.domain.Client;

import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    default ClientDTO toDto(Client client) {
        if (client == null) {
            return null;
        }
        ClientDTO dto = new ClientDTO();
        dto.setNom(client.getNom());
        dto.setPrenom(client.getPrenom());
        dto.setEmail(client.getEmail());
        dto.setTelephone(client.getTelephone());
        if (client.getDateInscription() != null) {
            dto.setDateInscription(client.getDateInscription().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        return dto;
    }
}
