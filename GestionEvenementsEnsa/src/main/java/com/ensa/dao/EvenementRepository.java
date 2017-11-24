package com.ensa.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ensa.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Integer>{
	
//	@Query("select e from Evenement e where e.titre like :x")
//	public Page<Evenement> getEvenementsParTitre(@Param("x")String titre, Pageable pageable);
	
	@Query("select e from Evenement e where e.etat like :x")
	public List<Evenement> getEvenementsParEtat(@Param("x")String etat);
	
	@Query("select e from Evenement e")
	public List<Evenement> getAllEvenements();
	
	@Query("select e from Evenement e where e.utilisateur like :x")
	public List<Evenement> getEvenementsParUtilisateur(@Param("x")String id_utilisateur);
}
