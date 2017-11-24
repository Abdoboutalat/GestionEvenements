package com.ensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ensa.dao.EvenementRepository;
import com.ensa.entities.Evenement;

@Component
public class ImplEvenementService implements IEvenementService {
	
	@Autowired
	private EvenementRepository evenementRepository;

	@Override
	public void enregistrerEvenement(Evenement evenement) {
		evenementRepository.save(evenement);
	}

	@Override
	public void modifierEvenement(Evenement evenement) {
		evenementRepository.save(evenement);
	}

	@Override
	public void supprimerEvenement(Evenement evenement) {
		evenementRepository.delete(evenement);
	}

	@Override
	public List<Evenement> listeEvenements() {
		return evenementRepository.getAllEvenements();
	}

	@Override
	public List<Evenement> listeEvenementsParEtat(String etat) {
		return evenementRepository.getEvenementsParEtat(etat);
	}

	@Override
	public List<Evenement> listeEvenementsParUtilisateur(String id_utilisateur) {
		return evenementRepository.getEvenementsParUtilisateur(id_utilisateur);
	}

}
