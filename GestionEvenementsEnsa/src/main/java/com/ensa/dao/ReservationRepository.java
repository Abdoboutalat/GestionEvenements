package com.ensa.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ensa.entities.Evenement;
import com.ensa.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
	
//	@Query("select r from Reservation r where r.titre like :x")
//	public Page<Reservation> getReservationsParTitre(@Param("x")String titre, Pageable pageable);
	
	@Query("select r from Reservation r where r.etat like :x")
	public List<Reservation> getReservationsParEtat(@Param("x")String etat);

	@Query("select r from Reservation r")
	public List<Reservation> getAllReservations();

	@Query("select r from Reservation r where r.utilisateur like :x")
	public List<Reservation> getReservationsParUtilisateur(@Param("x")String id_utilisateur);
}
