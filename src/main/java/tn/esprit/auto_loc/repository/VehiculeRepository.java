package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.auto_loc.domain.Vehicule;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
}
