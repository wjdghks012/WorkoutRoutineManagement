package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import User.UserInput;
import manager.UserManager;

public class UserViewer extends JPanel {
	
	
	WindowFrame frame;
	
	UserManager userManager;
	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<userManager.size(); i++) {
			Vector row =  new Vector();
			UserInput ui = userManager.get(i);
			row.add(ui.getId());
			row.add(ui.getName());
			row.add(ui.getEmail());
			row.add(ui.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp); 
	}

	public UserViewer(WindowFrame frame,UserManager userManager) {
		this.frame =frame;
		this.userManager = userManager;
		
		System.out.println("***" + userManager.size()+ "***");
		

	}

}
