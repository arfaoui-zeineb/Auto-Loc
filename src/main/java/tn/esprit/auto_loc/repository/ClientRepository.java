package tn.esprit.auto_loc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
//bsh nekhou les methode il kol hathrin


}
