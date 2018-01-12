
public class Partie {
	private boolean termine;
	private int tour;
	private Joueur joueur1;
	private Joueur joueur2;
	
	public Partie(Joueur joueur1, Joueur joueur2) {
		this.termine=false;
		this.tour=1;
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
	}

	public Joueur getJoueur1() {
		return joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public boolean isTermine() {
		return termine;
	}
	
	
	
}
