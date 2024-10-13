package ex2;

public class Compte {
	public static int n=0;
	private float solde=0;
	private int num;
	public Compte() {
		n++;
		num=n;
	}
	public int getNum() {
		return num;
	}
	public void deposer(float m) {
		solde=solde+m;
	}
	public void retirer(float m) {
		solde=solde-m;
	}
	public float avoirSolde() {
		return this.solde;
	}
	public void transferer(float m,Compte c) {
			this.solde=this.solde-m;
			c.solde=c.solde+m;
	}
	public String toString() {
		return "compte numero : "+num+" , solde = "+solde;
	}
}
