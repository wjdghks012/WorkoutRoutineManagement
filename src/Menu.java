import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class Menu {
	static EventLogger logger = new EventLogger("log.txt"); 
	
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		UserManager userManager = getObject("usermanager.usr");
		if (userManager == null) {
			userManager = new UserManager(input);
		}
		
		
		selectMenu(input,userManager);
		putObject(userManager, "usermanager.usr");
}
	public static void selectMenu(Scanner input, UserManager userManager) {
		int num = -1;				
		while (num !=5) { 	
			try {
			showMenu();	
			num = input.nextInt();
			switch(num) {
			case 1:
				userManager.addUser();
				logger.log("add a User");
				break;
			case 2:
				userManager.DeleteUser();
				logger.log("delete a User");
				break;
			case 3:
				userManager.EditUser();
				logger.log("edit a User");
				break;
			case 4:
				userManager.ViewUser();
				logger.log("view a list of User");
				break;
			default: 
				continue;
			}
		} 
			catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 and 5 !");
			if (input.hasNext()) {
				input.next();
			}
				num=-1;
				
		}
	}	

		
}
	public static void showMenu() {
			System.out.println(" ***PT User Management System Menu ***");
			
			System.out.println(" 1. Add User");
			
			System.out.println(" 2. Delete User");
		
			System.out.println(" 3. Edit User");
			
			System.out.println(" 4. View User ");
		
			System.out.println(" 5. Exit");
			
			System.out.println(" Select one number between 1-5: ");
		
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
