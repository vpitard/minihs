abstract class Etat{
  protected Serviteur serv;

  public Etat( Serviteur serv )
  {
    this.serv = serv;
  }
  
}

class EtatActif extends Etat{

  public EtatActif( Serviteur serv ){
    super( serv );
  }
}

class EtatSommeil extends Etat{

  public EtatSommeil( Serviteur serv ){
    super( serv );
  }
}