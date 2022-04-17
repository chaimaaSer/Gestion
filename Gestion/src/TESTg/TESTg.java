package TESTg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gstion.Voiture;
import junit.framework.*;


class TESTg {

	
	
	@Test
	void testVoiture() {
		
	}

	@Test
	void testGetNbrPortes() {
		 System.out.println("getNbrPortes");
		 Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
		    int NBrportes = 4;
		    v.setNbrPortes(4);
		    int nbrPortes =v.getNbrPortes();
		    
		    assertEquals(NBrportes, nbrPortes);
	}

	
	@Test
	void testSetNbrPortes() {
		 System.out.println("set Nbr portes");
		    int NbrPortes = 4;
		    Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
		    v.setNbrPortes(NbrPortes);
		   
		    assertEquals(v.getNbrPortes(), NbrPortes);
	}

	
	@Test
	void testToString() {
		Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
		String affichage = " La voiture Romain.S Audi d'immatriculation 123-AZE-456 contient 4 de portes";
		assertEquals(v.toString(),affichage);
			}

	@Test
	void testVehicule() {
		
	}

	@Test
	void testGetMarque() {
		System.out.println("get MARQUE ");
		 Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
		    String MARQUE = "Romain.S";
		    v.setMarque("Romain.S");
		    String marquee =v.getMarque();
		    assertEquals(MARQUE, marquee);
	}

	@Test
	void testSetMarque() {
		System.out.println("set MARQUE");
	    String MARQUE = "Romain.S";
	    Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
	    v.setMarque(MARQUE);
	   
	    assertEquals(v.getMarque(), MARQUE);

	}

	@Test
	void testGetModele() {
		System.out.println("get Modele ");
		 Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
		    String MODELE = "Audi";
		    v.setModele("Audi");
		    String modelee =v.getModele();
		    assertEquals(MODELE, modelee);
	}

	@Test
	void testSetModele() {
		System.out.println("set MARQUE");
	    String MODELE = "Audi";
	    Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
	    v.setModele(MODELE);
	   
	    assertEquals(v.getModele(), MODELE);

	}

	@Test
	void testGetImmatriculation() {
		System.out.println("getImmatriculation");
		 Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
		    String Immatriculation1 = "123-AZE-456";
		    v.setImmatriculation("123-AZE-456");
		    String Immatriculation2 =v.getImmatriculation();
		    assertEquals(Immatriculation1,Immatriculation2);
	}

	@Test
	void testSetImmatriculation() {
		System.out.println("set Immatriculation");
	    String Immatriculation1 = "123-AZE-456";
	    Voiture v = new Voiture("Romain.S","Audi" ,"123-AZE-456" ,  4);
	    v.setImmatriculation(Immatriculation1);
	   
	    assertEquals(v.getImmatriculation(), Immatriculation1);

	}

}
