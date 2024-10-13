package ex2td;

public class Dictionnaire {
	private int nbMots;
	private MotDico dico[];
	private String nom;
	public Dictionnaire(int n,MotDico dico[],String nom) {
		this.nom=nom;
		this.nbMots=n;
		this.dico=dico;
	}
	public void ajouterMot (MotDico m) {
		this.nbMots++;
		dico[this.nbMots]=m;
	}
	public int chercherMot (String ch) {
		int i=0;
		while (this.dico[i].getMot().equals(ch)==false && i<this.nbMots-1)
			i++;
		if (i==this.nbMots-1)
			return -1;
		else return i;
	}
	public void supprimerMot(String ch) {
		int i=chercherMot(ch);
		if(i==-1)
			System.out.println("ce mot n'existe pas");
		else if (i==this.nbMots-1){
			this.nbMots--;
		}
		else {
			for(int j=i;j<this.nbMots-1;j++) {
				this.dico[j]=this.dico[j+1];
			}
			this.nbMots--;
		}
	}
	public void listerDico(){
		for(int i=0;i<this.nbMots;i++){
			System.out.println(this.dico[i].getMot() + " : " + this.dico[i].getDefinition());
		}
	}
	public int nbSynonymes(MotDico m){
		int s=0;
		for(int i=0;i<this.nbMots;i++){
			if(m.synonyme(dico[i]))
				s++;
		}
		return s;
	}
	public void Affiche(String ch){
		int i=chercherMot(ch);
		if (i==-1)
			System.out.println("Ce mot n'existe pas");
		else
			System.out.println(this.dico[i].getMot() + " : " + this.dico[i].getDefinition());
	}
}
