
public abstract class Carte {
	protected int cout;
	protected String nom;
	protected String description;
	
	public Carte(int cout, String nom, String description) {
		super();
		this.cout = cout;
		this.nom = nom;
		this.description = description;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
