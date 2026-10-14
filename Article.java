package tp6;

public class Article extends Document{
     protected String auteur;
     public Article (String titre,int num,int nb,String auteur) {
    	 super(titre,num,nb);
    	 this.auteur=auteur;
     }
     public String getAuteur() {
   	  return auteur;
     }
     public void Edition() {
    	 super.Edition();
    	 System.out.println(" auteur="+auteur);
     }
}
