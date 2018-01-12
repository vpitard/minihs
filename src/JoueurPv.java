import java.util.ArrayList;

public abstract class JoueurPv {
	private String nom;
	protected int pv;
	protected ArrayList<ObserverPv> obs;

	public JoueurPv()
	{
		this.pv = 30;
		this.obs = new ArrayList<ObserverPv>();
	}

	public void ajoutObs( ObserverPv o ) { obs.add( o ); }
	public void supprObs( ObserverPv o ) { obs.remove( o ); }
	  
	private void notifier()
	{
		System.out.println("culhgfgf" + obs);
	    for( ObserverPv o : obs ){
	    	System.out.println("cul");
	    	o.update( pv );
	    }
	}

	public void updatePv(int pv)
	{
		System.out.println("----j1----" + getPv());
		this.pv = pv;
		System.out.println("----j1----" + getPv());
	    notifier();
	}
	  
	public int getPv() {
		  return pv;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
