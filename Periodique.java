package tp6;

public class Periodique extends Document {
    protected int frequence;
    public Periodique (String titre,int num,int nb,int frequence) {
   	 super(titre,num,nb);
   	 this.frequence=frequence;
    }
    public int getFrequence() {
  	  return frequence;
    }
    public void Edition() {
   	 super.Edition();
   	 System.out.println(" frequence="+frequence);
    }
}
