package tn.esprit.auto_loc.service;

import tn.esprit.auto_loc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();

    Vehicule addVehicule(Vehicule v);

    Vehicule updateVehicule(Vehicule v);

    Vehicule retrieveVehicule(Long idVehicule);

    void removeVehicule(Long idVehicule);

    List<Vehicule> addVehicules(List<Vehicule> vehicules);
}