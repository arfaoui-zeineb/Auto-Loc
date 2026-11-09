package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Reservation;
import tn.esprit.auto_loc.repository.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements IReservationService {

final    ReservationRepository reservationRepo;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) reservationRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return (Reservation) reservationRepo.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return (Reservation) reservationRepo.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return (Reservation) reservationRepo.findById(idReservation).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepo.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return (List<Reservation>) reservationRepo.saveAll(reservations);
    }
}