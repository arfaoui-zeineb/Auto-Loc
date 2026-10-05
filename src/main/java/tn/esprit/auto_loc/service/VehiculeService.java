package tn.esprit.auto_loc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Vehicule;
import tn.esprit.auto_loc.repository.VehiculeRepository;

import java.util.List;

@Service
public class VehiculeService implements IVehiculeService {

    @Autowired
    VehiculeRepository vehiculeRepo;

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
        return vehiculeRepo.findById(Math.toIntExact(idVehicule)).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        vehiculeRepo.deleteById(Math.toIntExact(idVehicule));
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) vehiculeRepo.saveAll(vehicules);
    }
}