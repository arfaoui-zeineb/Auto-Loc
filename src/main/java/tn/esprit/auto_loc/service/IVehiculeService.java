package tn.esprit.auto_loc.service;

import tn.esprit.auto_loc.domain.CategorieVehicule;
import tn.esprit.auto_loc.domain.StatutVehicule;
import tn.esprit.auto_loc.domain.Vehicule;

import java.math.BigDecimal;
import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();

    Vehicule addVehicule(Vehicule v);

    Vehicule updateVehicule(Vehicule v);

    Vehicule retrieveVehicule(Long idVehicule);

    void removeVehicule(Long idVehicule);

    List<Vehicule> addVehicules(List<Vehicule> vehicules);

    Vehicule affecterVehicule(Long idVehicule, Long idAgence);

    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);

    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);

    List<Vehicule> findByMarque(String marque);

    List<Vehicule> findByMarqueContaining(String marque);

    List<Vehicule> findByCategorie(CategorieVehicule categorie);

    List<Vehicule> findByStatut(StatutVehicule statut);

    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);

    List<Vehicule> findByMarqueAndStatut(String marque, StatutVehicule statut);
}