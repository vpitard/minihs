import java.util.ArrayList;

public class Heros {
	private String nom;
	private String pouvoir;
	private ArrayList<Carte> pioche;
	
	public Heros(String nom, String pouvoir) {
		super();
		this.nom = nom;
		this.pouvoir = pouvoir;
	}
	
	public void addCarte(Carte carte){
		this.pioche.add(carte);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPouvoir() {
		return pouvoir;
	}

	public void setPouvoir(String pouvoir) {
		this.pouvoir = pouvoir;
	}
	
	
}
