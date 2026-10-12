package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.Vehicule;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
}
