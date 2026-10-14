package tp6;

public class Document {
  private String titre;
  private int num;
  private int nb;
  public Document(String titre,int num,int nb) {
	  this.titre = titre;
	  this.num = num;
	  this.nb = nb;
  }
  public String getTitre() {
	  return titre;
  }
  public int getNum() {
	  return num;
  }
  public int getNb() {
	  return nb;
  }
  public void setTitre(String titre) {
	  this.titre=titre;
  }
  public void setNum(int num) {
	  this.num=num;
  }
  public void setNb(int nb) {
	  this.nb=nb;
  }
  public void Edition() {
	  System.out.println("titre="+titre+" num="+num+" nombre de pages="+nb);
  }
}
