package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Equipement;
import tn.esprit.auto_loc.repository.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements IEquipementService {

final    EquipementRepository equipementRepo;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) equipementRepo.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return (Equipement) equipementRepo.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return (Equipement) equipementRepo.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return (Equipement) equipementRepo.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        equipementRepo.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) equipementRepo.saveAll(equipements);
    }
}