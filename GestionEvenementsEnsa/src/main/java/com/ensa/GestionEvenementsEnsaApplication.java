package com.ensa;

import static org.mockito.Matchers.isNull;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ensa.dao.EvenementRepository;
import com.ensa.entities.Evenement;
import com.ensa.entities.Utilisateur;
import com.ensa.service.IEvenementService;


@SpringBootApplication
//@ComponentScan({"com.ensa.service"})
public class GestionEvenementsEnsaApplication implements CommandLineRunner{
//change by 2
//	@Autowired
//	private IEvenementService evenementService;
	public static void main(String[] args) {
		

		SpringApplication.run(GestionEvenementsEnsaApplication.class, args);
		
		
		
	}
	
	
	@Override
	public void run(String... arg0) throws Exception {
		
		
//		System.out.println("******++++++++++++++++++++++++++++++++++++++++++++++++*****************"+evenementService);
//		Evenement evenement = new Evenement("titre", null, "description", "etat",null, null);
//		evenement.setUtilisateur(new Utilisateur("usern", null, null, null, null, null, null));
//		evenementService.enregistrerEvenement(evenement);
		
	}
}//Pp
