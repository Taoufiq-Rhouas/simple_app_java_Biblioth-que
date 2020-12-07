package brif2Bibliothéque;

import java.util.ArrayList;
import java.util.Arrays;


public class persone {
	
	private String nom,prenom,email,filiere;
	
	public persone() {}
	public persone(String Nom,String Prenom,String Email,String Filiere) {
		this.nom=Nom;
		this.prenom=Prenom;
		this.email=Email;
		this.filiere=Filiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String filiere() {
		return filiere;
	}

	public void setFiliere(String f) {
		this.filiere = f;
	}
	@Override
	public String toString(  ) {
		return   this.nom + "," + this.prenom + "," + this.email + "," + this.filiere ;
	}
	
	

}
