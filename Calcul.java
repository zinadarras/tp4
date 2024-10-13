package ex1;

public class Calcul {

	public static void main(String[] args) {
		Entier e=new Entier(5);
		System.out.println(e.valeur);
		Entier e2=new Entier(7);
		int k=e.factoriel(5);
		int l= Entier.factoriel(7);
		System.out.println(e.valeur);
	}

}
