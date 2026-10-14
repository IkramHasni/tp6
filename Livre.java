package tp6;

public class Livre extends Article {
	protected String editeur;
	public Livre (String titre,int num,int nb,String auteur,String editeur) {
	 super(titre,num,nb,auteur);
	 this.editeur=editeur;
	 }
	 public String getEditeur() {
		  return editeur;
	  }
	 public void Edition() {
    	 super.Edition();
    	 System.out.println(" editeur="+editeur);
     }
}
