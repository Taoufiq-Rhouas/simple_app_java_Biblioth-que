package brif2Bibliothéque;

import java.util.ArrayList;
import java.util.Arrays;

public class employe extends persone {
	
	private static int count=1;
	private int id;
	public String telephone;
	public int age;
	
	public employe() {};
	
	public employe(String Nom, String Prenom, String Email, String Filiere,String tele, int Age) {
		super(Nom, Prenom, Email, Filiere);
		this.id=count++;
		this.telephone=tele;
		this.age=Age;
	}
	
	//Encapsulation
	//id
	public int getId() {
		return id;
	}
	public void SetId(int Id) {
		this.id=Id;
	}
	//telephone get/set
	public String telephone() {
		return telephone;
	}
	public void setTelephone(String tele) {
		this.telephone=tele;
	}
	//age get/set
	public int age() {
		return age;
	}
	public void setAge(int Age) {
		this.age=Age;
	}
	//Ajouter employee
	
	
	
	public void  AjouterEmployee(employe emp,ArrayList<employe> listEmp ) {
		listEmp.add(emp);
		System.out.println("Ajouter employee avec succes  :" + listEmp);
	}
	
	@Override
	public String toString() {
		return   "[" + this.id + "," + super.toString()+ "," + this.telephone + "]";
	}
	//supprimer 
	public void supprimerEmployee(ArrayList<employe> listEmploye ,int id) {
		for(int j=0;j<listEmploye.size();j++) {
			  
			  if(id==listEmploye.get(j).getId()) {
				  listEmploye.remove(j);
				  System.out.println("supprimer employe avec succes  de id =" + id);
				  
			  }
			  else {
				  System.out.println("sorry dont find");
			  }
			  }
	}
	
	//Modifier employe
		public void modifierEmploye(ArrayList<employe> ListEmploye, int id, String Nom,String prenom,String email,String filiere,String telephone,int age) {
			for(int j=0;j<ListEmploye.size();j++) {
				if(id==ListEmploye.get(j).getId()) {
					ListEmploye.get(j).SetId(id);
					ListEmploye.get(j).setNom(Nom);
					ListEmploye.get(j).setPrenom(prenom);
					ListEmploye.get(j).setEmail(email);
					ListEmploye.get(j).setFiliere(filiere);
					ListEmploye.get(j).setTelephone(telephone);
					ListEmploye.get(j).setAge(age);
					System.out.println("Modifier avec succes id =" + id + " and employe : \n" + ListEmploye.get(j).toString());
				}else {
					  System.out.println("sorry dont find");
				  }
			}
	}
}
