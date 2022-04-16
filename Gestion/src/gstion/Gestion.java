package gstion;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Gestion extends JPanel {
	private final Action action = new SwingAction();
	public Gestion() {
	
		JList listVehicule = new JList();
		listVehicule.setModel(new AbstractListModel() {
			String[] values = new String[] {"1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listVehicule.setBackground(Color.PINK);
		add(listVehicule);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		add(btnEnregistrer);
		
		JButton btnModifier = new JButton("Modifier");
		add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		add(btnSupprimer);
		
		JButton btnAjouter = new JButton("Ajouter");
		add(btnAjouter);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
