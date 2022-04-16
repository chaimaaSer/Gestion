package gstion;

public class Moto extends Vehicule {
 private int vitesseMax;
	public Moto(String marque, String modele, String immatriculation,int vitesseMax) {
		super(marque, modele, immatriculation);
		this.setVitesseMax(vitesseMax);
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
	
	@Override
	public String toString() {
		String affichage = " La moto " +getMarque()+" "+getModele()+ " d'immatriculation " +getImmatriculation()+ " a une vitesse maximale " +getVitesseMax();
		return affichage ;
	}


}
