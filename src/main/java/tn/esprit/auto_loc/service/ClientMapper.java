package tn.esprit.auto_loc.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.auto_loc.DTO.ClientDTO;
import tn.esprit.auto_loc.domain.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mapping(target = "dateInscription", source = "dateInscription", dateFormat = "dd/MM/yyyy")
    ClientDTO toDto(Client client);
}
