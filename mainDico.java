package ex2td;

public class mainDico {

	public static void main(String[] args) {
        MotDico m1 = new MotDico("Résilience", "Capacité à surmonter les difficultés.");
        MotDico m2 = new MotDico("Ingéniosité", "Capacité à trouver des solutions originales.");
        MotDico m3 = new MotDico("Éphémère", "Qui ne dure qu’un court moment.");
	    MotDico[] dict=new MotDico [3];
	    dict[0]=m1;
	    dict[1]=m2;
	    dict[2]=m3;
	    Dictionnaire Larousse=new Dictionnaire(3,dict,"Larousse");
	    Larousse.listerDico();
	    Larousse.Affiche("Amour");
	    Larousse.Affiche("Ingéniosité");
	    int i=Larousse.nbSynonymes(m1);
	    System.out.println(i);
	    Larousse.supprimerMot("Résilience");
	    Larousse.listerDico();
	}

}
