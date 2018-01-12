
public class Hearthstone {

	public static void main(String[] args) {
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		
		Partie laPartie = new Partie(joueur1,joueur2);
		
		while(!laPartie.isTermine()){
			
		}
		if(laPartie.getJoueur1().getPv()<=0){
			System.out.println("Joueur 2 a gagné");
		}
		if(laPartie.getJoueur2().getPv()<=0){
			System.out.println("Joueur 1 a gagné");
		}
	}

}
