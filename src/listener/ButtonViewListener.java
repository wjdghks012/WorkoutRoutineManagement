package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.UserViewer;
import gui.WindowFrame;
import manager.UserManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		UserViewer userViewer = frame.getUserviewer();
		UserManager userManager = getObject("usermanager.usr");	
		userViewer.setUserManager(userManager);
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(userViewer);
		frame.revalidate();
		frame.repaint();

	}
	public static UserManager getObject(String filename) {
		UserManager userManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			userManager = (UserManager) in.readObject();
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return userManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return userManager;
	}
}
