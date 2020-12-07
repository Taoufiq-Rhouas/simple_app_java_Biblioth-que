package brif2Bibliothéque;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		ArrayList<etudiant> ListEtudient= new ArrayList<etudiant>();
		ArrayList<employe> ListEmp= new ArrayList<employe>();
		ArrayList<livre> LisLiver= new ArrayList<livre>();
		String Nom,prenom,email,filiere,telephone,type,langue;
		Nom=prenom=email=filiere=telephone=type=langue="";
		int age;
		int id;
		etudiant etud = new etudiant();
		livre books = new livre();
		employe emp=new employe();
		while(true) {
			System.out.println(" Gestion etudient : 1 \n Gestion employe  : 2 \n Gestion livre    : 3");
              
			 String method=scan.next();
			 String choix="";
			 switch(method) {
			 	case "1":
			 		System.out.println("Gestion etudient \n  pour  ajouter etudient   -> 1 \n  pour  modifier etudient  -> 2 \n  pour  supprimer etudient -> 3");           
				    choix= scan.next();
				    switch(choix) {
				    	case "1":
				    		 System.out.println("entrer le Nom de  etudient");
							 Nom= scan.next();
							 System.out.println("entrer le prenom de  etudient");
							 prenom= scan.next();
							 System.out.println("entrer le email de  etudient");
							 email= scan.next();
							 System.out.println("entrer le filiere de  etudient");
							 filiere= scan.next();
							 etud=  new etudiant(Nom,prenom,email,filiere);
							 etud.Ajouteretudient(etud, ListEtudient);
							 break;
							 
				    	case "2":
				    		if(ListEtudient.size()>0) {
								System.out.println("les etudient  : \n " + ListEtudient); 
				  				System.out.println("entrer l id quel dois modifier ");
				  				id= scan.nextInt();
				  				System.out.println("entrer le Nom de  etudient");
								Nom= scan.next();
								System.out.println("entrer le prenom de  etudient");
								prenom= scan.next();
								System.out.println("entrer le email de  etudient");
								email= scan.next();
								System.out.println("entrer le filiere de  etudient");
								filiere= scan.next();
								//appel method modifierEtudient
			  		  			etud.modifierEtudient(ListEtudient, id, Nom,prenom,email,filiere);
				  		  		System.out.println(" etudient " + ListEtudient);
								
		  					}else {
		  						System.out.println("etudient vide Ajouter des etudients");
		  					}
		  					
		  					break;
		  					
				    	case "3":
				    		if(ListEtudient.size()>0) {
		  			  			System.out.println("les etudients  : \n " + ListEtudient); 
		  			  			System.out.println("entrer l id quel dois supprimer ");
		  			  			id= scan.nextInt();
		  			  			
		  			  			etud.supprimerEtudient(ListEtudient,id);
		  			  		}else {
		  			  			System.out.println("etudient vide Ajouter des etudients");
		  			  		}
		  					break;
				    	default:
				    }
				    break;
				    
			 	case "2":
			 		System.out.println("Gestion employe \n  pour  ajouter employe   -> 1 \n  pour  modifier employe  -> 2 \n  pour  supprimer employe -> 3");           
				    choix= scan.next();
				    switch(choix) {
				    	case "1":
				    		 System.out.println("entrer le Nom de  employee");
							 Nom= scan.next();
							 System.out.println("entrer le prenom de  employee");
							 prenom= scan.next();
							 System.out.println("entrer le email de  employee");
							 email= scan.next();
							 System.out.println("entrer le filiere de  employee");
							 filiere= scan.next();
							 System.out.println("entrer le numero telephone de  employee");
							 telephone= scan.next();
							 System.out.println("entrer l'age de  employee");
							 age= scan.nextInt();
							 emp= new employe(Nom,prenom,email,filiere,telephone, age);
							 emp.AjouterEmployee(emp, ListEmp);
							 break;
				    	case "2":
				    		if(ListEmp.size()>0) {
			  					System.out.println("les employes  : \n " + ListEmp); 
				  				System.out.println("entrer l id quel dois modifier ");
				  				id= scan.nextInt();
			  					 System.out.println("entrer le Nom de  employee");
								 Nom= scan.next();
								 System.out.println("entrer le prenom de  employee");
								 prenom= scan.next();
								 System.out.println("entrer le email de  employee");
								 email= scan.next();
								 System.out.println("entrer le filiere de  employee");
								 filiere= scan.next();
								 System.out.println("entrer le numero telephone de  employee");
								 telephone= scan.next();
								 System.out.println("entrer l'age de  employee");
								 age= scan.nextInt();
								 //appel method modifierEmploye
				  		  		 emp.modifierEmploye(ListEmp, id, Nom, prenom, email, filiere, telephone, age);
				  	
				  		  		System.out.println(" employe " + ListEmp);
		  					}else {
		  						System.out.println("employe vide Ajouter des employes");
		  					}
		  					break;
				    	case "3":
				    		if(ListEmp.size()>0) {
		  						System.out.println("les employee  : \n " + ListEmp); 
		  			  			System.out.println("entrer l id quel dois supprimer ");
		  			  			id= scan.nextInt();
		  			  			emp.supprimerEmployee(ListEmp, id);
		  					}else {
		  						System.out.println("employe vide Ajouter des employe");
		  					}
		  					break;
				    	default:
				    		
				    		
				    }
				    break;
			 	case "3":
			 		System.out.println("Gestion livre \n  pour  ajouter livre   -> 1 \n  pour  modifier livre  -> 2 \n  pour  supprimer livre -> 3");           
				    choix= scan.next();
				    switch(choix) {
				    	case "1":
				    		System.out.println("entrer le Nom de  liver");
							 Nom= scan.next();
							 System.out.println("entrer le type de  liver");
							 type= scan.next();
							 System.out.println("entrer la langue de  liver");
							 langue= scan.next();
							 books= new livre(Nom,type,langue);
							 books.ajouterLivre(books, LisLiver);
							 
							 break;
							 
				    	case "2":
				    		if(LisLiver.size()>0) {
		  						System.out.println("les livres  : \n " + LisLiver); 
		  		  				System.out.println("entrer l id quel dois modifier ");
		  		  				id= scan.nextInt();
		  		  				System.out.println("entrer le Nom de  liver");
		  		  				Nom= scan.next();
		  		  				System.out.println("entrer le type de  liver");
		  		  				type= scan.next();
		  		  				System.out.println("entrer la langue de  liver");
		  		  				langue= scan.next();
		  		  				//appel method modifierLiver(....);
		  		  				books.modifierLivre(LisLiver, id, Nom, type, langue);
				  		  		System.out.println(" livre " + LisLiver);
		  					}else {
		  						System.out.println("livre vide Ajouter des livres");
		  					}
				  		  	break;
				  		  	
				    	case"3":
				    		if(LisLiver.size()>0) {
		  						System.out.println("les livres  : \n " + LisLiver); 
		  			  			System.out.println("entrer l id quel dois supprimer ");
		  			  			id= scan.nextInt();
		  			  			books.supprimerLivre(books, LisLiver,id);
		  					}else {
		  						System.out.println("livre vide Ajouter des livres");
		  					}
		  					break;
				    	default:
				    		
				    }
			 			
			 }
		}

	}

}
