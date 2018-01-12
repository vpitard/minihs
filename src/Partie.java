
public class Partie extends ObserverPv{
	private int tour;
	
	public Partie(JoueurPv joueur1, JoueurPv joueur2) {
		super(joueur2, joueur2);
		this.tour=1;
	}

	public JoueurPv getJoueur1() {
		return joueur1;
	}

	public JoueurPv getJoueur2() {
		return joueur2;
	}

	public boolean isTermine() {
		return termine;
	}
	
	
	
}
