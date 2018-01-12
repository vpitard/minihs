import java.util.ArrayList;

public class Joueur extends JoueurPv{
	private int mana;
	private boolean premier;
	private int armure;
	private ArrayList<Serviteur> serviteurs;
	
	public Joueur() {
		super();
		this.mana=1;
		this.armure=0;
		this.serviteurs = new ArrayList<Serviteur>();
	}

	public ArrayList<Serviteur> getServiteurs() {
		return serviteurs;
	}

	public void addServiteur(Serviteur serviteur) {
		this.serviteurs.add(serviteur);
	}	
}
