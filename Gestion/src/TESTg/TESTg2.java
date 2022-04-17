package TESTg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gstion.Camion;
import gstion.Moto;

class TESTg2 {

	@Test
	void testCamion() {
	}

	@Test
	void testIsRemorque() {
		
	}

	@Test
	void testSetRemorque() {
		System.out.println("set Remorque");
	    boolean Remorque = true;
	    Camion c= new Camion("Romain.S","Audi1" ,"123-Age-456" ,  true);
	    c.setRemorque(true);
	   
	    assertEquals(c.isRemorque(), Remorque);
	}

	@Test
	void testToString() {
		Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
		String affichage = " Le Camion Romain.S Audi12 d'immatriculation 123-AZ-456 contient  un remorque";
		assertEquals(c.toString(),affichage);
	}

	@Test
	void testVehicule() {
		
	}

	@Test
	void testGetMarque() {
		System.out.println("get MARQUE ");
		Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
		    String MARQUE = "Romain.S";
		    c.setMarque("Romain.S");
		    String marquee =c.getMarque();
		    assertEquals(MARQUE, marquee);
	}

	@Test
	void testSetMarque() {
		System.out.println("set MARQUE");
	    String MARQUE = "Romain.S";
	    Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
	    c.setMarque(MARQUE);
	   
	    assertEquals(c.getMarque(), MARQUE);
	}

	@Test
	void testGetModele() {
		System.out.println("get Modele ");
		Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
		    String MODELE = "Audi12";
		    c.setModele("Audi12");
		    String modelee =c.getModele();
		    assertEquals(MODELE, modelee);
	}

	@Test
	void testSetModele() {
		System.out.println("set MARQUE");
	    String MODELE = "Audi12";
	    Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
	    c.setModele(MODELE);
	   
	    assertEquals(c.getModele(), MODELE);
	}

	@Test
	void testGetImmatriculation() {
		System.out.println("getImmatriculation");
		Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
		    String Immatriculation1 = "123-AZ-456";
		    c.setImmatriculation("123-AZ-456");
		    String Immatriculation2 =c.getImmatriculation();
		    assertEquals(Immatriculation1,Immatriculation2);
	}

	@Test
	void testSetImmatriculation() {
		System.out.println("set Immatriculation");
	    String Immatriculation1 = "123-AZ-456";
	    Camion c= new Camion("Romain.S","Audi12" ,"123-AZ-456" ,  true);
	   c.setImmatriculation(Immatriculation1);
	   
	    assertEquals(c.getImmatriculation(), Immatriculation1);
	}

}
