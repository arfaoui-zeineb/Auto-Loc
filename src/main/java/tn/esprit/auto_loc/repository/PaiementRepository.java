package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.auto_loc.domain.Paiement;


public interface PaiementRepository extends CrudRepository<Paiement, Long>{
}
