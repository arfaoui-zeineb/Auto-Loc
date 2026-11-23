package tn.esprit.auto_loc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
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
    @Query("SELECT v FROM Agence a JOIN a.vehicules v WHERE a.idAgence = :idAgence")
    List<Vehicule> findVehiculesByAgence(@Param("idAgence") Long idAgence);
    List<Vehicule> getVehiculesByAgence(Long idAgence);
    @Query("SELECT v.agence.idAgence, COUNT(v) FROM Vehicule v GROUP BY v.agence.idAgence")
    List<Object[]> countVehiculesByAgence();
}
