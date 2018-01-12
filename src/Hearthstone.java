import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
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
		
		Serviteur serviteur1 = new Serviteur(1,"Sanglier brocheroc","",1,1);
		Serviteur serviteur2 = new Serviteur(1,"Soldat du comte de l'or","",2,1);
		Serviteur serviteur3 = new Serviteur(3,"Chevaucheur de loup","",1,3);
		Serviteur serviteur4 = new Serviteur(4,"Yeti noroit","",5,4);
		Serviteur serviteur5 = new Serviteur(3,"Chef de raid","",2,2);
		
		Serviteur serviteurPaladin = new Serviteur(3,"Champion frisselame","",2,3);
		Serviteur serviteurGuerrier = new Serviteur(2,"Avocat commis d'office","",7,0);
		
		ArrayList<Carte> pioche = new ArrayList<Carte>();
		pioche.add(serviteur1);
		pioche.add(serviteur2);
		pioche.add(serviteur3);
		pioche.add(serviteur4);
		pioche.add(serviteur5);
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        Heros joueurUnHeros = null;
        Heros joueurDeuxHeros = null;

        int line = 0;
        while(joueurUnHeros==null){
        	System.out.println("Joueur un choisit un heros :");
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
        
        
        
        
        
        
        while(joueurDeuxHeros==null){
        	System.out.println("Joueur deux choisit un heros :");
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
        				
		JoueurPv joueur1 = new Joueur(joueurUnHeros, "Joueur1");
		JoueurPv joueur2 = new Joueur(joueurDeuxHeros, "Joueur2");
		
		Partie laPartie = new Partie(joueur1,joueur2);
		
		((Joueur)laPartie.joueur1).addServiteur(serviteur1);
		((Joueur)laPartie.joueur1).addServiteur(serviteur2);
		((Joueur)laPartie.joueur2).addServiteur(serviteur3);
		
		int tour = 0;
		int i = 0;
		
		for(int temp=0; i<3; i++){
	        ((Joueur)laPartie.getJoueur1()).addCarte(pioche(pioche));
		}
		
		for(int temp=0; i<4; i++){
	        ((Joueur)laPartie.getJoueur2()).addCarte(pioche(pioche));
		}
		
		while(laPartie.isTermine()==false){
			Joueur joueurCourant = null;
			Joueur joueurAdverse = null;
			
			if(i%2==0){
				joueurCourant = (Joueur)joueur1;
				joueurAdverse = (Joueur)joueur2;
				tour++;
				joueurCourant.plusUnMana();
				joueurAdverse.plusUnMana();
			}
			else{
				joueurCourant = (Joueur)joueur2;
				joueurAdverse = (Joueur)joueur1;
			}
			joueurCourant.reveilleServiteurs();
			joueurCourant.addCarte(pioche(pioche));
			
			boolean tourTermine = false;
			int manaTour = joueurCourant.getMana();
			
			System.out.println("Tour " + tour);
			System.out.println("Joueur : " + joueurCourant.getNom() + " joue");
			
			while(!tourTermine){
				System.out.println("1 - Voir mon plateau");
				System.out.println("2 - Voir ma main");
				System.out.println("3 - Voir plateau adverse");
				System.out.println("4 - Utiliser pouvoir heroique");
				System.out.println("5 - Fin de tour");
				
				line = scan.nextInt();
				
				switch(line){
        		case 1 :
        			System.out.println("Mon plateau : ");
        			if(joueurCourant.getServiteurs().size()>0){
        				int nbServiteurs = 0;
        				for(Serviteur s : joueurCourant.getServiteurs()){
            				System.out.println(nbServiteurs + " - " + s.getNom() + " : " + s.getAttaque() + "/" + s.getPv() + " - " + s.getEtatCourant());
            				nbServiteurs++;
            			}
        				System.out.println("Choisir un serviteur pour attaquer ou taper 99 pour revenir en arriere");
        				line = scan.nextInt();
        				if(line==99){
        					break;
        				}
        				else{
        					if(!(joueurCourant.getServiteurs().get(line).getEtatCourant() instanceof EtatSommeil)){
            					manaTour-=joueurCourant.getServiteurs().get(line).getCout();
            					joueurCourant.getServiteurs().get(line).enSommeil();
                				System.out.println(joueurCourant.getServiteurs().get(line).getNom() + " attaque");
        					}
        					else{
        						System.out.println("Ce serviteur ne peu pas attaquer");
        					}
        				}
        			}
        			else{
        				System.out.println("Aucun serviteur");
        				break;
        			}
        		case 2 :
        			System.out.println("Ma main :");
        			if(joueurCourant.getMain().size()>0){
        				for(Carte c : joueurCourant.getMain()){
        					System.out.println( c.getNom() + " , " + c.getCout() + " mana , " + c.getDescription()) ;
        					if ( c instanceof Serviteur){
        						System.out.println( " , " + ((Serviteur)c).getPv() + " pv - " + ((Serviteur)c).getAttaque() + " att") ;
        					}
           				}
        			}
        			else{
        				System.out.println("Votre main est vide");
        				break;
        			}
        		case 3 :
        			System.out.println("Plateau adverse: ");
        			if(joueurAdverse.getServiteurs().size()>0){
        				int nbServiteurs = 0;
        				for(Serviteur s : joueurAdverse.getServiteurs()){
            				System.out.println(nbServiteurs + " - " + s.getNom() + " : " + s.getAttaque() + "/" + s.getPv() + " - " + s.getEtatCourant());
            				nbServiteurs++;
            			}
        				break;
        			}
        			else{
        				System.out.println("Aucun serviteur");
        				break;
        			}
        		case 4 :
        			System.out.println("Ne fonctionne pas");
        			break;
        		case 5 :
        			System.out.println("5 - Fin de tour");
        			tourTermine=true;
        			break;
				}
				
				i++;
			}
        	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//-------------------------------------------------------------
			//laPartie.getJoueur1().updatePv(0);
		}
		if(laPartie.getJoueur1().getPv()<=0){
			System.out.println("|_-_ Joueur 2 a gagne _-_|");
		}
		if(laPartie.getJoueur2().getPv()<=0){
			System.out.println("|_-_ Joueur 1 a gagne _-_|");
		}
	}

	public static Carte pioche(ArrayList<Carte> pioche){
		Random random = new Random();
		int index = random.nextInt(pioche.size());
        Carte cartePiochée = pioche.get(index);
		return cartePiochée;
	}
}
