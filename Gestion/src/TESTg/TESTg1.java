package TESTg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gstion.Moto;
import gstion.Voiture;

class TESTg1 {

	@Test
	void testMoto() {
	
	}

	@Test
	void testGetVitesseMax() {
		 System.out.println("get VitesseMax");
		 Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
		    int VitesseMax1 = 80;
		    m.setVitesseMax(80);
		    int VitesseMax =m.getVitesseMax();
		    
		    assertEquals(VitesseMax1, VitesseMax);
	}

	@Test
	void testSetVitesseMax() {
		System.out.println("set vitesse max");
	    int VitesseMax = 80;
	    Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
	    m.setVitesseMax(VitesseMax);
	   
	    assertEquals(m.getVitesseMax(), VitesseMax);
	}

	@Test
	void testToString() {
		Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
		String affichage = " La moto Romain.S Audi1 d'immatriculation 123-Age-456 a une vitesse maximale 80 " ;
		assertEquals(m.toString(),affichage);
	}

	@Test
	void testVehicule() {
		
	}

	@Test
	void testGetMarque() {
		System.out.println("get MARQUE ");
		Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
		    String MARQUE = "Romain.S";
		    m.setMarque("Romain.S");
		    String marquee =m.getMarque();
		    assertEquals(MARQUE, marquee);
	}

	@Test
	void testSetMarque() {
		System.out.println("set MARQUE");
	    String MARQUE = "Romain.S";
	    Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
	    m.setMarque(MARQUE);
	   
	    assertEquals(m.getMarque(), MARQUE);
	}

	@Test
	void testGetModele() {
		System.out.println("get Modele ");
		 Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
		    String MODELE = "Audi1";
		    m.setModele("Audi1");
		    String modelee =m.getModele();
		    assertEquals(MODELE, modelee);
	}

	@Test
	void testSetModele() {
		System.out.println("set MARQUE");
	    String MODELE = "Audi1";
	    Moto m= new Moto("Romain.S","Audi1" ,"123-Age-456" ,  80);
	    m.setModele(MODELE);
	   
	    assertEquals(m.getModele(), MODELE);
	}

	@Test
	void testGetImmatriculation() {
		System.out.println("getImmatriculation");
		  Moto m= new Moto("Romain.S","Audi" ,"123-Age-456" ,  80);
		    String Immatriculation1 = "123-Age-456";
		    m.setImmatriculation("123-Age-456");
		    String Immatriculation2 =m.getImmatriculation();
		    assertEquals(Immatriculation1,Immatriculation2);
	}

	@Test
	void testSetImmatriculation() {
		System.out.println("set Immatriculation");
	    String Immatriculation1 = "123-Age-456";
	    Moto m= new Moto("Romain.S","Audi" ,"123-Age-456" ,  80);
	   m.setImmatriculation(Immatriculation1);
	   
	    assertEquals(m.getImmatriculation(), Immatriculation1);
	}

}
