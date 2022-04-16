package gstion;

public class Voiture extends Vehicule{
 
	private int nbrPortes;
	public Voiture(String marque, String modele, String immatriculation,int nbrPortes) {
		super(marque, modele, immatriculation);
		this.setNbrPortes(nbrPortes);
	}
	public int getNbrPortes() {
		return nbrPortes;
	}
	public void setNbrPortes(int nbrPortes) {
		this.nbrPortes = nbrPortes;
	}
	
	@Override
	public String toString() {
		String affichage = " La voiture " +getMarque()+" "+getModele()+ "d'immatriculation " +getImmatriculation()+ "contient "+getNbrPortes()+ " de portes";
		return affichage ;
	}

}
