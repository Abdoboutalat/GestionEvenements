package com.ensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensa.dao.ReservationRepository;
import com.ensa.entities.Reservation;

public class ImplReservationService implements IReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void enregistrerReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}

	@Override
	public void modifierReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}

	@Override
	public void supprimerReservation(Reservation reservation) {
		reservationRepository.delete(reservation);
	}

	@Override
	public List<Reservation> listeReservations() {
		return reservationRepository.getAllReservations();
	}

	@Override
	public List<Reservation> listeReservationsParEtat(String etat) {
		return reservationRepository.getReservationsParEtat(etat);
	}

	@Override
	public List<Reservation> listeReservationsParUtilisateur(String id_utilisateur) {
		return reservationRepository.getReservationsParUtilisateur(id_utilisateur);
	}

}
