import java.util.ArrayList;

public class Joueur extends JoueurPv{
	private int mana;
	private boolean premier;
	private int armure;
	private Heros heros;
	private ArrayList<Serviteur> serviteurs;
	private ArrayList<Carte> main;
	
	public Joueur(Heros herosChoisi) {
		super();
		this.mana=1;
		this.armure=0;
		this.heros = herosChoisi;
		this.serviteurs = new ArrayList<Serviteur>();
		this.main = new ArrayList<Carte>();
	}

	public ArrayList<Serviteur> getServiteurs() {
		return serviteurs;
	}

	public void addServiteur(Serviteur serviteur) {
		if(serviteur.getNom()=="Chef de raid"){
			serviteursPlusUnAttaque();
		}
		this.serviteurs.add(serviteur);
	}

	public ArrayList<Carte> getMain() {
		return main;
	}

	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}
	
	public void serviteursPlusUnAttaque(){
		for(Serviteur s : this.serviteurs){
			int att = s.getAttaque()+1;
			s.setAttaque(att);
		}
	}
	
	public void serviteursMoinsUnAttaque(){
		for(Serviteur s : this.serviteurs){
			int att = s.getAttaque()-1;
			s.setAttaque(att);
		}
	}
	
	
}
