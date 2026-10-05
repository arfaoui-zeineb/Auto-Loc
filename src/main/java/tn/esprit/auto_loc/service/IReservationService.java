package tn.esprit.auto_loc.service;

import tn.esprit.auto_loc.domain.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservations();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);

    List<Reservation> addReservations(List<Reservation> reservations);
}