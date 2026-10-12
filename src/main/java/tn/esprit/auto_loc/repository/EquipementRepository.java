package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.Equipement;
@Repository
public interface EquipementRepository extends CrudRepository<Equipement, Long> {
}
