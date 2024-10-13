package ex2td;

public class MotDico {
	public static int num=0;
	private String mot;
	private String definition;
	public MotDico(String mot, String def) {
		this.mot=mot;
		this.definition=def;
		num++;
	}
	public String getMot() {
		return this.mot;
	}
	public String getDefinition() {
		return this.definition;
	}
	public void setdefinition(String s) {
		this.definition=s;
	}
	public void setMot(String s) {
		this.mot=s;
	}
	public boolean synonyme(MotDico m) {
		return this.definition==m.definition;
	}
}
