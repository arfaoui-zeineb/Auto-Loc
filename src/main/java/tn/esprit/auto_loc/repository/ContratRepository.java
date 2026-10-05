package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.auto_loc.domain.Contrat;


public interface ContratRepository extends CrudRepository<Contrat, Long> {
}
