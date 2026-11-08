package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Agence;
import tn.esprit.auto_loc.domain.Equipement;
import tn.esprit.auto_loc.domain.Vehicule;
import tn.esprit.auto_loc.repository.AgenceRepository;
import tn.esprit.auto_loc.repository.EquipementRepository;
import tn.esprit.auto_loc.repository.VehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements IVehiculeService {

    final VehiculeRepository vehiculeRepo;
    final AgenceRepository agenceRepo;
    final EquipementRepository equipementRepo;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) vehiculeRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vehiculeRepo.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return vehiculeRepo.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return vehiculeRepo.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        vehiculeRepo.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) vehiculeRepo.saveAll(vehicules);
    }

    @Override
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).orElse(null);
        Agence agence = agenceRepo.findById(idAgence).orElse(null);
        if (vehicule != null && agence != null) {
            vehicule.setAgence(agence);
            return vehiculeRepo.save(vehicule);
        }
        return null;
    }

    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).orElse(null);
        Equipement equipement = equipementRepo.findById(idEquipement).orElse(null);
        if (vehicule != null && equipement != null) {
            vehicule.getEquipements().add(equipement);
            return vehiculeRepo.save(vehicule);
        }
        return null;
    }

    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).orElse(null);
        Equipement equipement = equipementRepo.findById(idEquipement).orElse(null);
        if (vehicule != null && equipement != null) {
            vehicule.getEquipements().remove(equipement);
            return vehiculeRepo.save(vehicule);
        }
        return null;
    }
}