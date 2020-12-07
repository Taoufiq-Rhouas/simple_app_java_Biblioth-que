package brif2Bibliothéque;

import java.util.ArrayList;
import java.util.Arrays;

public class livre {
	
	private static int count=1;
	private int id;
	private String title,ganre,language;
	
	public livre() {};
	public livre (String title,String ganre,String language) {
		this.id=count++;
		this.title = title;
		this.ganre = ganre;
		this.language = language;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void SetId(int Id) {
		this.id=Id;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGanre() {
		return ganre;
	}

	public void setGanre(String ganre) {
		this.ganre = ganre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return  "["+ this.id + "," +this.title + "," + this.ganre +"," + this.language+"]" ;
	}
	//Ajouter employee
	
		public void  ajouterLivre( livre books,ArrayList<livre> listbooks ) {
			listbooks.add(books);
			System.out.println("Ajouter liver avec succes");
			System.out.println(" livre " + listbooks);
			
		}
		public void supprimerLivre(livre livre,ArrayList<livre> listbooks ,int id) {
		for(int j=0;j<listbooks.size();j++) {
			  
			  if(id==listbooks.get(j).getId()) {
				  listbooks.remove(j);
				  System.out.println("supprimer avec succes id =" + id);
				  
			  }
			  else {
				  System.out.println("sorry dont find");
			  }
			  }
		}
		
		public void modifierLivre(ArrayList<livre> listbooks ,int id,String title,String ganre,String language) {
			for(int j=0;j<listbooks.size();j++) {
				  
				  if(id==listbooks.get(j).getId()) {
					  listbooks.get(j).SetId(id);
					  listbooks.get(j).setTitle(title);
					  listbooks.get(j).setGanre(ganre);
					  listbooks.get(j).setLanguage(language);
					  System.out.println("Modifier avec succes id =" + id + " and livre : \n " + listbooks.get(j).toString());
				  }else {
					  System.out.println("sorry dont find");
				  }
				  }
			}
	
	
	
	
	
	
}





































