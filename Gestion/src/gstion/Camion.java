package gstion;

public class Camion extends Vehicule {
 private boolean remorque;   
	public Camion(String marque, String modele, String immatriculation,boolean remorque) {
		super(marque, modele, immatriculation);
		this.setRemorque(remorque);
	}
	public boolean isRemorque() {
		return remorque;
	}
	public void setRemorque(boolean remorque) {
		this.remorque = remorque;
	}
	
	@Override
	public String toString() {
		String affichage;
		if(isRemorque())
			affichage = " Le Camion " +getMarque()+" "+getModele()+ " d'immatriculation " +getImmatriculation()+ " contient  un remorque";
 		else 
			 affichage = " Le Camion " +getMarque()+" "+getModele()+ " d'immatriculation " +getImmatriculation()+ " ne contient pas un remorque";
		return affichage ;
	}


}
