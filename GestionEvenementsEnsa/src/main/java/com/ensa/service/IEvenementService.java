package com.ensa.service;

import java.util.List;

import com.ensa.entities.Evenement;

public interface IEvenementService {
	
	public void enregistrerEvenement(Evenement evenement);
	public void modifierEvenement(Evenement evenement);
	public void supprimerEvenement(Evenement evenement);
	public List<Evenement> listeEvenements();
	public List<Evenement> listeEvenementsParEtat(String etat);
	public List<Evenement> listeEvenementsParUtilisateur(String id_utilisateur);
}
