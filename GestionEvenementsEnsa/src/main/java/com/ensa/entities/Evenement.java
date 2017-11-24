package com.ensa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Evenement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String titre;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private String description;
	private String etat;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="evenement")
	private Reservation reservation;
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;

	public Evenement() {
		super();
	}

	public Evenement(Integer id, Date dateCreation, String description, String etat, Date dateDebut, Date dateFin) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.description = description;
		this.etat = etat;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	
	public Evenement(String titre, Date dateCreation, String description, String etat, Date dateDebut, Date dateFin) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.description = description;
		this.etat = etat;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Evenement(Integer id, String titre, Date dateCreation, String description, String etat, Date dateDebut,
			Date dateFin) {
		super();
		this.id = id;
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.description = description;
		this.etat = etat;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date date) {
		this.dateCreation = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
}
