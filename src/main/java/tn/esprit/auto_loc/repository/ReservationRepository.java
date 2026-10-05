package tn.esprit.auto_loc.repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.auto_loc.domain.Reservation;



public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
