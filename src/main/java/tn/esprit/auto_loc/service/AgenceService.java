

package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Agence;
import tn.esprit.auto_loc.repository.AgenceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceService implements IAgenceService {


    final AgenceRepository agenceRepo;

    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) agenceRepo.findAll();
    }

    @Override
    public Agence addAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return agenceRepo.findById(idAgence).get();
    }

    @Override
    public void removeAgence(Long idAgence) {
        agenceRepo.deleteById(idAgence);
    }

    @Override
    public List<Agence> addAgences(List<Agence> agences) {
        return (List<Agence>) agenceRepo.saveAll(agences);
    }
}