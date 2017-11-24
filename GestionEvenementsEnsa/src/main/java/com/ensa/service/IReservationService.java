package com.ensa.service;

import java.util.List;

import com.ensa.entities.Evenement;
import com.ensa.entities.Reservation;

public interface IReservationService {

	public void enregistrerReservation(Reservation reservation);
	public void modifierReservation(Reservation reservation);
	public void supprimerReservation(Reservation reservation);
	public List<Reservation> listeReservations();
	public List<Reservation> listeReservationsParEtat(String etat);
	public List<Reservation> listeReservationsParUtilisateur(String id_utilisateur);

}
