package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.Maintenance;
@Repository
public interface MaintenanceRepository extends CrudRepository<Maintenance, Long> {
}
