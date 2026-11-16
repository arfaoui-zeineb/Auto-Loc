package tn.esprit.auto_loc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.CategorieVehicule;
import tn.esprit.auto_loc.domain.StatutVehicule;
import tn.esprit.auto_loc.domain.Vehicule;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

    List<Vehicule> findByMarque(String marque);

    List<Vehicule> findByMarqueContaining(String marque);

    List<Vehicule> findByCategorie(CategorieVehicule categorie);

    List<Vehicule> findByStatut(StatutVehicule statut);

    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);

    List<Vehicule> findByMarqueAndStatut(String marque, StatutVehicule statut);
}
