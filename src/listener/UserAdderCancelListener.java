package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.UserAdder;
import gui.UserViewer;
import gui.WindowFrame;

public class UserAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public UserAdderCancelListener(WindowFrame frame) {
		this.frame=frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();

	}
 
}
