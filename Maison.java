package ex3;

public class Maison {
	private String type;
	private String adr;
	private int nbChambre;
	private float surface;
	public Maison(String adr,String t,int n) {
		this.adr=adr;
		this.type=t;
		this.nbChambre =n;
	}
	public Maison(String adr,String t,int n,float s) {
		this (adr,t,n);
		this.surface=s;
	}
	public void setSurface(float s) {
		this.surface=s;
	}
	public void calculPrix(float pmc) {
		System.out.println("le prix est "+pmc*this.surface);
	}
	public void calculPrix() {
		System.out.println("le prix est "+2100*this.surface);
	}
	public String toChaine () {
		return this.type+" de "+this.surface+" m2 à "+this.adr+" avec "+this.nbChambre+" chambres.";
	}
	public static void main(String[] args) {
		Maison m1=new Maison("Tunis","un duplex",4,210);
		Maison m2=new Maison("Nabeul","une villa",5);
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
		m2.setSurface(230);
		m1.calculPrix();
		m2.calculPrix();
		m1.calculPrix(3000);
		m2.calculPrix(5000);
	}
}

