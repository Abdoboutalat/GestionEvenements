package com.ensa.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.Evenement;
import com.ensa.entities.Reservation;
import com.ensa.service.IEvenementService;
import com.ensa.service.IReservationService;

@RestController
@CrossOrigin("*")
public class RestService {
	@Autowired
	private IEvenementService evenementService;
	
	@Autowired
	private IReservationService reservationService;
	
	
	//---------------------------------start evenement services--------------------------------------------\\
	
				//*********************************start administrateur opperations
	@RequestMapping(value="/administrateur/evenements", method=RequestMethod.GET)
	public List<Evenement> getAllEvenements() {
		return evenementService.listeEvenements();
	}
				//*********************************end administrateur opperations
	
	
	
	
	
				//*********************************start etudiants et profs opperations
	@RequestMapping(value="/evenements", method=RequestMethod.GET)
	public List<Evenement> getEvenementParUtilisateur(@RequestParam(name="id_utilisateur")String id_utilisateur) {
		return evenementService.listeEvenementsParUtilisateur(id_utilisateur);
	}
	
	@RequestMapping(value="/ajouterEvenements", method=RequestMethod.GET)
	public void ajouterEvenement(
			@RequestParam String titre,
			@RequestParam Date dateCreation,
			@RequestParam String description,
			@RequestParam String etat,
			@RequestParam Date dateDebut,
			@RequestParam Date dateFin
			) {
		
		Evenement evenement = new Evenement(titre, dateCreation, description, etat, dateDebut, dateFin);
		evenementService.enregistrerEvenement(evenement);
	}
	
	@RequestMapping(value="/modifierEvenements", method=RequestMethod.GET)
	public void modifierEvenement(
			@RequestParam Integer id,
			@RequestParam String titre,
			@RequestParam Date dateCreation,
			@RequestParam String description,
			@RequestParam String etat,
			@RequestParam Date dateDebut,
			@RequestParam Date dateFin
			) {
		Evenement evenement = new Evenement(id, titre, dateCreation, description, etat, dateDebut, dateFin);
		evenementService.modifierEvenement(evenement);
	}
	
	@RequestMapping(value="/supprimerEvenements", method=RequestMethod.GET)
	public void supprimerEvenement(
			@RequestParam Integer id
			) {
		Evenement evenement = new Evenement();
		evenement.setId(id);
		evenementService.supprimerEvenement(evenement);
	}
	
				//*********************************end etudiants et profs opperations

	//---------------------------------end evenement services--------------------------------------------\\
	

	
	
	//---------------------------------start reservation services--------------------------------------------\\
	
				//*********************************start administrateur opperations
	@RequestMapping(value="/administrateur/reservations", method=RequestMethod.GET)
	public List<Reservation> getAllReservations() {
		return reservationService.listeReservations();
	}
				//*********************************end administrateur opperations





				//*********************************start etudiants et profs opperations
	@RequestMapping(value="/reservations", method=RequestMethod.GET)
	public List<Reservation> getReservationsParUtilisateur(@RequestParam(name="id_utilisateur")String id_utilisateur) {
		return reservationService.listeReservationsParUtilisateur(id_utilisateur);
	}
	
	@RequestMapping(value="/ajouterReservations", method=RequestMethod.GET)
	public void ajouterReservation(
			@RequestParam String titre,
			@RequestParam Date dateCreation,
			@RequestParam String description,
			@RequestParam String etat
			) {
	Reservation evenement = new Reservation(titre, dateCreation, description, etat);
	reservationService.enregistrerReservation(evenement);
	}
	
	@RequestMapping(value="/modifierReservations", method=RequestMethod.GET)
	public void modifierReservation(
			@RequestParam Integer id,
			@RequestParam String titre,
			@RequestParam Date dateCreation,
			@RequestParam String description,
			@RequestParam String etat
			) {
	Reservation evenement = new Reservation(id, titre, dateCreation, description, etat);
	reservationService.modifierReservation(evenement);
	}
	
	@RequestMapping(value="/supprimerReservations", method=RequestMethod.GET)
	public void supprimerReservation(
			@RequestParam Integer id
			) {
	Reservation evenement = new Reservation();
	evenement.setId(id);
	reservationService.supprimerReservation(evenement);
	}

				//*********************************end etudiants et profs opperations

	//---------------------------------end reservation services--------------------------------------------\\

}
