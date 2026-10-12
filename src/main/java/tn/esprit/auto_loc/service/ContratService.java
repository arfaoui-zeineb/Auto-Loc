package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Contrat;
import tn.esprit.auto_loc.repository.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratService implements IContratService {

    final ContratRepository contratRepo;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) contratRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return (Contrat) contratRepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return (Contrat) contratRepo.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return (Contrat) contratRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        contratRepo.deleteById(idContrat);
    }

    @Override
    public List<Contrat> addContrats(List<Contrat> contrats) {
        return (List<Contrat>) contratRepo.saveAll(contrats);
    }
}
