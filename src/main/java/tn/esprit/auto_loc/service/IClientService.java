package tn.esprit.auto_loc.service;
import tn.esprit.auto_loc.domain.Client;

import java.util.List;

public interface IClientService {
        List<Client> retrieveAllClients();
        Client addClient(Client c);
        Client updateClient(Client c);
        Client retrieveClient(Long idClient);
        void removeClient(Long idClient);
        List<Client> addClients (List<Client> clients);
}
