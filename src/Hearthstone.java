
public class Hearthstone {

	public static void main(String[] args) {
		JoueurPv joueur1 = new Joueur();
		JoueurPv joueur2 = new Joueur();
		
		Partie laPartie = new Partie(joueur1,joueur2);
		
		while(laPartie.isTermine()==false){
			System.out.println("--------" + laPartie.getJoueur1().getPv());
			System.out.println("--------" + laPartie.getJoueur2().getPv());
			laPartie.getJoueur1().updatePv(0);
			System.out.println("--------" + laPartie.getJoueur1().getPv());
			System.out.println("--------" + laPartie.getJoueur2().getPv());
			
		}
		if(laPartie.getJoueur1().getPv()<=0){
			System.out.println("--------" + laPartie.getJoueur1().getPv());
			System.out.println("Joueur 2 a gagné");
		}
		if(laPartie.getJoueur2().getPv()<=0){
			System.out.println("--------" + laPartie.getJoueur2().getPv());
			System.out.println("Joueur 1 a gagné");
		}
	}

}
