package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Client;
import tn.esprit.auto_loc.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    final ClientRepository clRepo;

    @Override
    public List<Client> retrieveAllClients() {
        return (List<Client>) clRepo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clRepo.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clRepo.save(c);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clRepo.findById(idClient).get();
    }

    @Override
    public void removeClient(Long idClient) {
        clRepo.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return (List<Client>) clRepo.saveAll(clients);
    }
}
