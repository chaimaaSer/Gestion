package gstion;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class JFrame extends javax.swing.JFrame {
 protected static final Component This = null;
ArrayList<Vehicule> vehicules;
 DefaultListModel modeleListe;
 File fichier;
 FileWriter fw;
 PrintWriter pw;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
					frame.setTitle("Gestion de Parking");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public JFrame() {
		initComponents();
		vehicules= new ArrayList<>();
		modeleListe= new  DefaultListModel();
		
		try {
			fichier = new File("fichier.veh");
			fw= new FileWriter(fichier);
			pw= new PrintWriter(fw);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		///////////////////////////////////////AJOUTER/////////////////////
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			
			Vehicule vehicule=null;
			private Component This;
			String marque,modele,immatriculation, type;
			int nbrPortes,vitesseMax,choix=0;
			boolean remorque;
			
			public void actionPerformed(ActionEvent e) {
				type=JOptionPane.showInputDialog(This,"Entrez le type de vehicule Voiture/Camion/Moto ", "Type",JOptionPane.PLAIN_MESSAGE);
				
				if(type.equalsIgnoreCase("Voiture")) {
					marque=JOptionPane.showInputDialog(This,"Entrez la marque de vehicule", "Marque",JOptionPane.PLAIN_MESSAGE);
					modele=JOptionPane.showInputDialog(This,"Entrez la modele de vehicule", "Modele",JOptionPane.PLAIN_MESSAGE);
					immatriculation=JOptionPane.showInputDialog(This,"Entrez la immatriculation de vehicule", "Immatriculation",JOptionPane.PLAIN_MESSAGE);
					nbrPortes=Integer.parseInt(JOptionPane.showInputDialog(This,"Entrez le  nombre de portes", "Nombre de portes",JOptionPane.PLAIN_MESSAGE));
			        vehicule=new Voiture(marque,modele,immatriculation,nbrPortes);
			        
				}
					
				else if(type.equalsIgnoreCase("Moto")) {
					marque=JOptionPane.showInputDialog(This,"Entrez la marque de moto", "Marque",JOptionPane.PLAIN_MESSAGE);
					modele=JOptionPane.showInputDialog(This,"Entrez la modele de moto", "Modele",JOptionPane.PLAIN_MESSAGE);
					immatriculation=JOptionPane.showInputDialog(This,"Entrez la immatriculation de moto", "Immatriculation",JOptionPane.PLAIN_MESSAGE);
					vitesseMax=Integer.parseInt(JOptionPane.showInputDialog(This,"Entrez la vitesse maximale", "Vitesse maximale",JOptionPane.PLAIN_MESSAGE));
			        vehicule=new Moto(marque,modele,immatriculation,vitesseMax);
			        
				}
					
				else if(type.equalsIgnoreCase("Camion")) {
					marque=JOptionPane.showInputDialog(This,"Entrez la marque de vehicule", "Marque",JOptionPane.PLAIN_MESSAGE);
					modele=JOptionPane.showInputDialog(This,"Entrez la modele de vehicule", "Modele",JOptionPane.PLAIN_MESSAGE);
					immatriculation=JOptionPane.showInputDialog(This,"Entrez la immatriculation de vehicule", "Immatriculation",JOptionPane.PLAIN_MESSAGE);
				    choix= JOptionPane.showConfirmDialog(This,"Le camion a-t-il un remorque","Remorque",JOptionPane.YES_NO_OPTION);
					  if (choix==0)remorque = true;
					  else remorque =false;
					  vehicule=new Camion (marque,modele,immatriculation,remorque);
					  
				}
				else {
					JOptionPane.showMessageDialog(This,"Votre choix incorrecte","Choix incorrecte",JOptionPane.OK_OPTION);
				}
				  vehicules.add(vehicule);
				  modeleListe.add( modeleListe.getSize(), vehicule);
				  JList listVehicule = new JList();
				  contentPane.add(listVehicule, BorderLayout.CENTER);
				  listVehicule.setModel(modeleListe);

			}
			
		});
		contentPane.add(btnAjouter, BorderLayout.NORTH);
/////////////////////////////////////////////////////SUPPRIMER///////////////////////
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 JList listVehicule = new JList();
				 contentPane.add(listVehicule, BorderLayout.CENTER);
				if(listVehicule.isSelectionEmpty())
					JOptionPane.showMessageDialog(This, "selectionner un vehicule à supprimer","pas de selection",JOptionPane.ERROR_MESSAGE);
				else {

					int indice;
				    indice= listVehicule.getSelectedIndex();
				    modeleListe.remove(indice);
				    vehicules.remove(indice);
				}
				
			}
		});
		contentPane.add(btnSupprimer, BorderLayout.SOUTH);
/////////////////////////////////////////////////////ENREGISTRER///////////////////////////////////////////////////////////////////////////////////////////////		
		JButton btnEnregestrer = new JButton("Enrregistrer");
		btnEnregestrer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				for(Vehicule v: vehicules) {
					pw.println(v);
				}
				pw.close();
			}
			
		});
		contentPane.add(btnEnregestrer, BorderLayout.EAST);
		
		JList listVehicule = new JList();
		listVehicule.setValueIsAdjusting(true);
		listVehicule.setSelectedIndices(new int[] {1});
		listVehicule.setBorder(new LineBorder(new Color(0, 0, 0)));
		listVehicule.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listVehicule.setSelectedIndex(1);
		contentPane.add(listVehicule, BorderLayout.CENTER);
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}

}
