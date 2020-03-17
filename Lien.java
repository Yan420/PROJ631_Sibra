import java.util.ArrayList;


public class Lien {
	private int numLigne;
	private Arret arretArrivee;
	private ArrayList<Horaire> planning;
	
	
	public Lien(int numLigne, Arret arretArrivee,
			ArrayList<Horaire> planning) {
		super();
		this.numLigne = numLigne;
		this.arretArrivee = arretArrivee;
		this.planning = planning;
	}


	public int getNumLigne() {
		return numLigne;
	}


	public Arret getArretArrivee() {
		return arretArrivee;
	}


	public ArrayList<Horaire> getPlanning() {
		return planning;
	}
	
}
