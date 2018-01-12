
public abstract class Serviteur extends Carte {

	protected int pv;
	protected int attaque;
	
	protected Etat etatSommeil;
	protected Etat etatActif;
	protected Etat etatCourant;
	
	public Serviteur(int coût, String nom, String description, int pv, int attaque) {
		super(coût, nom, description);
		this.pv = pv;
		this.attaque = attaque;
		this.etatSommeil = new EtatSommeil(this);
		this.etatActif = new EtatActif(this);
		this.etatCourant = this.etatSommeil;
	}
	
	protected void activer(){
		this.etatCourant = this.etatActif;
	}
	
	protected void enSommeil(){
		this.etatCourant = this.etatSommeil;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	
	public Etat getEtatCourant() {
		return this.etatCourant;
	}
}
