package ex2;

public class Banque {

	public static void main(String[] args) {
		Compte co1=new Compte();
		System.out.println(co1);
		Compte co2=new Compte();
		System.out.println(co2);
		co1.deposer(1200);
		co2.deposer(500);
		System.out.println(co1.avoirSolde());
		System.out.println(co2.avoirSolde());
		co2.transferer(700, co1);
		if (co1.avoirSolde()<0)
			System.out.println("co1 est en rouge, son num est "+co1.getNum());
		if (co2.avoirSolde()<0)
			System.out.println("co2 est en rouge, son num est "+co2.getNum());
	}

}
