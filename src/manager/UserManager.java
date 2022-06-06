package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import User.Man;
import User.Oldman;
import User.User;
import User.UserInput;
import User.UserKind;
import User.WomanUser;
import User.Youngman;

import exception.EmailFormatException;

public class UserManager implements Serializable { 	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1526103906663641581L;
	
	ArrayList<UserInput> users = new ArrayList<UserInput>();	
	transient Scanner input;	
	UserManager(Scanner input){
		this.input= input;
	}
	
	public  void addUser() {
		int kind = 0;
		UserInput userInput;
		while (kind !=1 && kind !=4) {	
		try {
				System.out.print("Select User Kind: ");
				System.out.print("1 Man. ");
				System.out.print("2 Woman. ");
				System.out.print("3 Young man. ");
				System.out.print("4 Old man. ");
				System.out.print("Select num for User Kind between 1 and 4: ");
				kind = input.nextInt();
				if (kind==1) { 
					userInput = (UserInput) new Man(UserKind.Man); 
					userInput.getUserInput(input);
					users.add(userInput);
					break;
					
				}
				else if (kind==2) {
					userInput = new WomanUser(UserKind.Woman);
					userInput.getUserInput(input);
					users.add(userInput);
					break;
				}
				else if (kind==3) {
						userInput = new Youngman(UserKind.Youngman);
						userInput.getUserInput(input);
						users.add(userInput);
						break;
				}
				else if (kind==4) {
					userInput = new Oldman(UserKind.Oldman); 
					userInput.getUserInput(input);
					users.add(userInput);
					break;
				}
				else { 
					System.out.print("Select num for User Kind between 1 and 4: ");
				}
			}
		catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 and 4 !");
			if (input.hasNext()) {
				input.next();
			}
				kind=-1;
				
			
		}
	}			
				
}
	
	public  void DeleteUser() {
	System.out.println("User ID : ");
	int UserID = input.nextInt();
	int index = findIndex(UserID);
	removefromUser(index , UserID);
	
	}
	
	

	public int findIndex(int UserID) {
		int index = -1;
		for (int i =0;i<users.size(); i++) {
			if(users.get(i).getId() == UserID) {
				index= i;
				break;
			}
		
	}
		return index;
}	
	public int removefromUser(int index , int UserID) {
		if (index >=0) {
			users.remove(index);
			System.out.println("the user " + UserID + "is deleted"); 		
			return 1;
		}
		else {
			System.out.println("the user has not been registered");
			return -1;
		}
		
	}

	public  void EditUser() {
	
	System.out.println("User ID : ");
	int UserID = input.nextInt();
	for (int i=0; i<users.size(); i++) {
		UserInput user = users.get(i);
		if (user.getId()== UserID) {
			int num = -1;
			while (num !=5) {
				showEditMenu();	
				num = input.nextInt();
				switch(num) {
				case 1:
					user.setUserID(input);
					break;
				case 2:
					user.setUserName(input);
					break;
				case 3:
					try {
						user.setUserEmail(input);
					} catch (EmailFormatException e) {
						e.printStackTrace();
					}	
					break;
				case 4:
					user.setUserPhone(input);	
					break;
				default: 
					continue;
				}
			}
		}
	}
	
}
	
	public  void ViewUser() {
	
	System.out.println("# of registered users:" +users.size());
	for (int i=0; i<users.size(); i++) {
		users.get(i).printInfo();
		}	
	}

	public int size() {
		return users.size();
	}
	
	public UserInput get(int index) {
		return(User) users.get(index);
	}
	public void showEditMenu() {
		System.out.println( "*** User Info Edit Menu *** ");
		System.out.println(" 1. Edit ID");				
		System.out.println(" 2. Edit Name");			
		System.out.println(" 3. Edit Email");				
		System.out.println(" 4. View Phone "); 			
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1-5 : ");
		
	}
}
