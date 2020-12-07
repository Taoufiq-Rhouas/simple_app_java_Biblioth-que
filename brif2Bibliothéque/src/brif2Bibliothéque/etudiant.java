package brif2Bibliothéque;

import java.util.ArrayList;
import java.util.Arrays;

public class etudiant extends persone {
	
	private static int count=1;
	private int id;
	
	public etudiant() {}
	public etudiant(String Nom, String Prenom, String Email, String Filiere) {
		super(Nom, Prenom, Email, Filiere);
		// TODO Auto-generated constructor stub
		
		this.id=count++;
	}
	
	//Encapsulation
	//id
	public int getId() {
		return id;
	}
	public void SetId(int Id) {
		this.id=Id;
	}
	@Override
	public String toString() {
		return "[" + this.id + "," + super.toString() + "]";
	}
	//Ajouter etudient
	//composition
	public static void Ajouteretudient(etudiant etudient, ArrayList<etudiant> etud ) {
		etud.add(etudient);
		System.out.println("Ajouter etudient avec succes  :" + etud);
	}
	//supprimer etudient
	public void supprimerEtudient(ArrayList<etudiant> listEtudient ,int id) {
		for(int j=0;j<listEtudient.size();j++) {
			  if(id==listEtudient.get(j).getId()) {
				  listEtudient.remove(j);
				  System.out.println("supprimer etudient avec succes  de id =" + id); 
			  }else {
				  System.out.println("sorry dont find");
			  }
			  }
	}
	//Modifier etudient
	public void modifierEtudient(ArrayList<etudiant> ListEtudient, int id, String Nom,String prenom,String email,String filiere) {
		for(int j=0;j<ListEtudient.size();j++) {
			if(id==ListEtudient.get(j).getId()) {
				ListEtudient.get(j).SetId(id);
				ListEtudient.get(j).setNom(Nom);
				ListEtudient.get(j).setPrenom(prenom);
				ListEtudient.get(j).setEmail(email);
				ListEtudient.get(j).setFiliere(filiere);
				System.out.println("Modifier avec succes id =" + id + " and etudient : \n" + ListEtudient.get(j).toString());
			}else {
				  System.out.println("sorry dont find");
			  }
		}
	}
	
	

}
