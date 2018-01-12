import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Hearthstone {

	public static void main(String[] args) {
		ArrayList<Heros> heros = new ArrayList<Heros>();
		
		Heros mage = new Heros("Mage", "Boule de feu");
		heros.add(mage);
		Heros paladin = new Heros("Paladin", "Renfort");
		heros.add(paladin);
		Heros guerrier = new Heros("Guerrier", "Armure");
		heros.add(guerrier);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        Heros joueurUnHeros = null;
        Heros joueurDeuxHeros = null;

        int line = 0;
        while(joueurUnHeros==null){
        	System.out.println("Joueur un choisit un héros :");
        	int choix = 1;
        	for(Heros h : heros){
        		System.out.println(choix + " - " + h.getNom() + " : " + h.getPouvoir());
        		choix++;
        	}
        	line = scan.nextInt();
        	switch(line){
        		case 1 :
        			joueurUnHeros = mage;
        			break;
        		case 2 :
        			joueurUnHeros = paladin;
        			break;
        		case 3 :
        			joueurUnHeros = guerrier;
        			break;
        	}
        }
        System.out.println("j1 : " +joueurUnHeros.getNom());
        while(joueurDeuxHeros==null){
        	System.out.println("Joueur deux choisit un héros :");
        	int choix = 1;
        	for(Heros h : heros){
        		System.out.println(choix + " - " + h.getNom() + " : " + h.getPouvoir());
        		choix++;
        	}
        	line = scan.nextInt();
        	switch(line){
        		case 1 :
        			joueurDeuxHeros = mage;
        			break;
        		case 2 :
        			joueurDeuxHeros = paladin;
        			break;
        		case 3 :
        			joueurDeuxHeros = guerrier;
        			break;
        	}
        }

//        System.out.println("j1 : " +joueurUnHeros.getNom());
//        System.out.println("j2 : " +joueurDeuxHeros.getNom());
        				
		JoueurPv joueur1 = new Joueur(joueurUnHeros);
		JoueurPv joueur2 = new Joueur(joueurDeuxHeros);
		
		Partie laPartie = new Partie(joueur1,joueur2);
		
		while(laPartie.isTermine()==false){
//			Joueur joueurCourant = (Joueur)joueur1;
//			Joueur joueurAdverse = (Joueur)joueur2;
//			boolean tourTermine = false;
//			
//			System.out.println("Joueur : " + joueurCourant.getNom() + " commence");
//			
//			while(!tourTermine){
//				System.out.println("1 - Voir mon plateau");
//				System.out.println("2 - Voir ma main");
//				System.out.println("3 - Voir plateau adverse");
//				System.out.println("4 - Utiliser pouvoir héroïque");
//				System.out.println("5 - Fin de tour");
//				
//				line = scan.nextInt();
//				
//				switch(line){
//        		case 1 :
//        			System.out.println("Mon plateau : ");
//        			if(joueurCourant.getServiteurs().size()>0){
//        				int nbServiteurs = 0;
//        				for(Serviteur s : joueurCourant.getServiteurs()){
//            				System.out.println(nbServiteurs + " - " + s.getNom() + " : " + s.getAttaque() + "/" + s.getPv() + " - " + s.getEtatCourant());
//            				nbServiteurs++;
//            			}
//        				System.out.println("Choisir un serviteur pour attaquer ou taper 99 pour revenir en arrière");
//        				line = scan.nextInt();
//        				if(line==99){
//        					break;
//        				}
//        				else{
//        					System.out.println(joueurCourant.getServiteurs().get(line).getNom() + "attaque");
//        				}
//        			}
//        			else{
//        				System.out.println("Aucun serviteur");
//        				break;
//        			}
//        		case 2 :
//        			System.out.println("Ma main :");
//        			if(joueurCourant.getMain().size()>0){
//        				for(Carte c : joueurCourant.getMain()){
//        					System.out.println( c.getNom() + " , " + c.getCout() + " mana , " + c.getDescription()) ;
//        					if ( c instanceof Serviteur){
//        						System.out.println( " , " + ((Serviteur)c).getPv() + " pv - " + ((Serviteur)c).getAttaque() + " att") ;
//        					}
//           				}
//        			}
//        			else{
//        				System.out.println("Votre main est vide");
//        				break;
//        			}
//        		case 3 :
//        			System.out.println("Plateau adverse: ");
//        			if(joueurAdverse.getServiteurs().size()>0){
//        				int nbServiteurs = 0;
//        				for(Serviteur s : joueurAdverse.getServiteurs()){
//            				System.out.println(nbServiteurs + " - " + s.getNom() + " : " + s.getAttaque() + "/" + s.getPv() + " - " + s.getEtatCourant());
//            				nbServiteurs++;
//            			}
//        				break;
//        			}
//        			else{
//        				System.out.println("Aucun serviteur");
//        				break;
//        			}
//        		case 4 :
//        			System.out.println("Ne fonctionne pas");
//        			break;
//        		case 5 :
//        			System.out.println("5 - Fin de tour");
//        			tourTermine=true;
//        			break;
//				}
//			}
        	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//-------------------------------------------------------------
			laPartie.getJoueur1().updatePv(0);
		}
		if(laPartie.getJoueur1().getPv()<=0){
			System.out.println("Joueur 2 a gagné");
		}
		if(laPartie.getJoueur2().getPv()<=0){
			System.out.println("Joueur 1 a gagné");
		}
	}

}
