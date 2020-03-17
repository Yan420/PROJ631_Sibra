import java.util.ArrayList;

//typeJour peut prendre la valueur "normal ou special", special etant les dimanches, jours feries...
public class Horaire {
	private String heureDepart, heureArrivee;
	private String typeJour;

	
	public Horaire(String heureDepart, String heureArrivee, String typeJour) {
		super();
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.typeJour = typeJour;
	}
	public String getHeureDepart() {
		return heureDepart;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}
	public String getTypeJour() {
		return typeJour;
	}
	

}
