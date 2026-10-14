package tp6;

public class Bibliotheque {
	public int nbdoc=0;
    public Document [] listedoc;
    public int cap;
    public Bibliotheque(int cap ) {
    	this.cap=cap;
    	listedoc=new Document[cap];
    }
    public void getCapacite(int cap) {
    	this.cap=cap;
    }
 
    public void Ajout_doc(Document d) {
    	if (nbdoc<cap) {
    		listedoc[nbdoc]=d;
    		nbdoc++;
    	}
    }
    public void Supprim_doc(int num) {
    	for (int i=0 ;i<nbdoc ;i++) {
    		 if (listedoc[i] != null && listedoc[i].getNum() == num) {
                 for (int j = i; j < nbdoc - 1; j++) {
                     listedoc[j] = listedoc[j + 1];
                 }

                 listedoc[nbdoc - 1] = null;
                 nbdoc--;
                 return;
             }
         }
     

    }
    
    public void Inventaire_doc() {
    	for (int i=0 ;i <cap ;i++) {
    	 if(listedoc[i]!=null) {
    		listedoc[i].Edition();
    		System.out.println("\n") ;
    		}
    }}
   public int getNombre_document() {
	   return nbdoc;
   }
   public Bibliotheque liste_livre() {
   	   Bibliotheque k = new Bibliotheque(cap);
       for (int i=0; i < nbdoc; i++) {
           if (listedoc[i] instanceof Livre) {
               k.Ajout_doc(listedoc[i]);
           }
       }
       return k;
   } 
public Bibliotheque liste_article() {
	   Bibliotheque k = new Bibliotheque(cap);
    for (int i=0; i < nbdoc; i++) {
        if (listedoc[i] instanceof Article) {
            k.Ajout_doc(listedoc[i]);
        }
    }
    return k;
} 
public Bibliotheque liste_docsimples() {
    Bibliotheque k = new Bibliotheque(cap);
    for (int i = 0; i < nbdoc; i++) {
        if (listedoc[i] != null && listedoc[i].getClass() == Document.class) {
            k.Ajout_doc(listedoc[i]);
        }
    }

    return k;
}

public Bibliotheque liste_periodique() {
	   Bibliotheque k = new Bibliotheque(cap);
    for (int i=0; i < nbdoc; i++) {
        if (listedoc[i] instanceof Periodique) {
            k.Ajout_doc(listedoc[i]);
        }
    }
    return k;
} }






    

