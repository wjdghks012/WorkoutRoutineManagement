package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.UserAdderCancelListener;
import listener.UserAdderListener;
import manager.UserManager;

public class UserAdder extends JPanel {
	
	WindowFrame frame;
	
	UserManager userManager;
	
	public UserAdder(WindowFrame frame,UserManager userManager) {
		this.frame =frame;
		this.userManager = userManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID:  ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		
		JLabel labelName = new JLabel("Name:  ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		
		
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("Email:  ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelID.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelPhone = new JLabel("Phone:  ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelID.setLabelFor(fieldPhone);
		
		JButton saveButton = new JButton ("Save");
		saveButton.addActionListener(new UserAdderListener(fieldID,fieldName,fieldEmail,fieldPhone,userManager));
	
		JButton cancelButton = new JButton ("Cancel");
		cancelButton.addActionListener(new UserAdderCancelListener(frame));
		
		
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		

		this.add(panel);
		this.setVisible(true);
	}

}
