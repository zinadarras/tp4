package ex1;

public class Entier {
	private int n;
	static int valeur=0;
	public Entier(int n) {
		this.n=n;
		valeur++;
	}
	public static int factoriel (int n) {
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void absolu (int n) {
		if (n>=0)
			System.out.println(n);
		else 
			System.out.println(-n);
	}
	public static void comparer(int e1,int e2) {
		if (e1>e2)
			System.out.println(e1+" > "+e2);
		else if (e1==e2)
			System.out.println(e1+" = "+e2);
		else
			System.out.println(e1+" < "+e2);
	}
	public static void premier(int n) {
		int div=0;
		if (n==0||n==1)
			System.out.println(n+" n'est pas premier");
		else {
		for (int i=2;i<n;i++) {
			if (n%i==0)
				div++;
		}
		if (div==0)
			System.out.println(n+" est premier");
		else
			System.out.println(n+" n'est pas premier");
		}
	}
}
