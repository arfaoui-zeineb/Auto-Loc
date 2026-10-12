package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.Contrat;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long> {
}
