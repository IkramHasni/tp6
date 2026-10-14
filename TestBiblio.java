package tp6;

public class TestBiblio {

	public static void main(String[] args) {
		Document d =new Document("t1",20,50);
		Article a =new Article("t2",30,100,"Victor");
		Livre l=new Livre("t3",40,60,"Auteur","Edit");
		Periodique p=new Periodique("t4",60,77,70);
		Bibliotheque tab=new Bibliotheque(4);
		tab.Ajout_doc(d);
		tab.Ajout_doc(a);
		tab.Ajout_doc(l);
		tab.Ajout_doc(p);
		System.out.println("tab avant suppression =");
		tab.Inventaire_doc();
		tab.Supprim_doc(20);
		System.out.println("tab apres suppression =");
		tab.Inventaire_doc();
		System.out.println("\n nb element= "+tab.getNombre_document());
	}
}
