package tn.esprit.auto_loc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loc.domain.Reservation;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    List<Reservation> findByDateDebutAfter(LocalDate date);
    @Query("SELECT r FROM Client c JOIN c.reservations r WHERE c.idClient = :idClient")
    List<Reservation> findReservationsByClient(@Param("idClient") Long idClient);    List<Reservation> getReservationsByClient(Long idClient);
    @Query("SELECT r.client.idClient, COUNT(r) FROM Reservation r GROUP BY r.client.idClient")
    List<Object[]> countReservationsByClient();
}
