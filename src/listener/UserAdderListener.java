package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import User.ManUser;
import User.User;
import User.UserInput;
import User.UserKind;
import exception.EmailFormatException;
import manager.UserManager;

public class UserAdderListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	
	UserManager userManager;
	
	public UserAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldEmail, 
			JTextField fieldPhone,UserManager userManager) {
		super();
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.userManager = userManager;
	}


	

	@Override
	public void actionPerformed(ActionEvent e) {
		UserInput user = new ManUser(UserKind.Man);

		try {
			user.setId(Integer.parseInt(fieldID.getText()));
			user.setName(fieldName.getName());
			user.setEmail(fieldEmail.getText());
			user.setPhone(fieldPhone.getText());
			userManager.addUser(user);
			putObject(userManager, "usermanager.usr");
			user.printInfo();
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
	
	}
	public static void putObject(UserManager userManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(userManager);
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
