import java.util.ArrayList;


public class Arret {
	private String nom;
	private ArrayList<Lien> liens;
	
	public Arret(String nom, ArrayList<Lien> liens) {
		super();
		this.nom = nom;
		this.liens = liens;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Lien> getLiens() {
		return liens;
	}
	
	
}
