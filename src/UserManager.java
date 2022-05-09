import java.util.ArrayList;
import java.util.Scanner;

import User.Man;
import User.Oldman;
import User.User;
import User.UserInput;
import User.UserKind;
import User.WomanUser;
import User.Youngman;

public class UserManager { 	
	ArrayList<UserInput> users = new ArrayList<UserInput>();	
	Scanner input;	
	UserManager(Scanner input){
		this.input= input;
	}
	
	public  void addUser() {
		int kind = 0;
		UserInput userInput;
		while (kind !=1 && kind !=4) {
		
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
				
				
	}
	
	public  void DeleteUser() {
	System.out.println("User ID : ");
	int UserID = input.nextInt();
	int index = -1;
	for (int i =0;i<users.size(); i++) {
		if(users.get(i).getId() == UserID) {
			index= i;
			break;
		}
	}
	
	if (index >=0) {
		users.remove(index);
		System.out.println("the user " + UserID + "is deleted"); 		
	}
	else {
		System.out.println("the user has not been registered");
		return;
	}
}

	public  void EditUser() {
	
	System.out.println("User ID : ");
	int UserID = input.nextInt();
	for (int i=0; i<users.size(); i++) {
		UserInput userInput = users.get(i);
		if (userInput.getId()== UserID) {
			int num = -1;
			while (num !=5) {
				System.out.println( "*** User Info Edit Menu *** ");
				System.out.println(" 1. Edit ID");				
				System.out.println(" 2. Edit Name");			
				System.out.println(" 3. Edit Email");				
				System.out.println(" 4. View Phone "); 			
				System.out.println(" 5. Exit");
				System.out.println("Select one number between 1-5 : ");
				num = input.nextInt();
				if (num==1 ) {
					System.out.println(" User ID: ");
					int id = input.nextInt();
					userInput.setId(id);
				}
				else if(num==2) {
					System.out.println(" User Name: ");
					String name = input.next();
					userInput.setName(name);					
				}
				else if(num==3) {
					System.out.println(" Email address: ");
					String email = input.next();
					userInput.setEmail(email);
				}
				else if(num==4) {
					System.out.println(" Phone number: ");
					String phone = input.next();
					userInput.setPhone(phone);
			}
				else {
					continue;				
				}				
		}
			break;
		}
	}
}
	
	public  void ViewUser() {
	
	System.out.println("# of registered users:" +users.size());
	for (int i=0; i<users.size(); i++) {
		users.get(i).printInfo();
		}
	

	}
}
