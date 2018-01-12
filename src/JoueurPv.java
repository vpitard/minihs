import java.util.ArrayList;

public abstract class JoueurPv {
	protected String nom;
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
	    for( ObserverPv o : obs ){
	    	o.update( pv );
	    }
	}

	public void updatePv(int pv)
	{
		this.pv = pv;
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
