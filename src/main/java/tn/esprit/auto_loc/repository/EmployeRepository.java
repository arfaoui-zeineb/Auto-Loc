package tn.esprit.auto_loc.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.auto_loc.domain.Employe;

public interface EmployeRepository extends CrudRepository<Employe, Long> {
}
