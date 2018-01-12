abstract class ObserverPv {

	  protected int pvMin;
	  protected boolean termine;
	  protected JoueurPv joueur1;
	  protected JoueurPv joueur2;

	  public ObserverPv( JoueurPv j1, JoueurPv j2 )
	  {
		  this.termine=false;
		  joueur1 = j1;
		  joueur2 = j2;
		  joueur1.ajoutObs( this );
		  joueur2.ajoutObs( this );
	  }

	  public void update( int pv )
	  {
	    this.pvMin = pv;
	    if(this.pvMin<=0){
	    	this.termine = true;
	    }
	  }
}
