 package User;

import java.util.Scanner;

import exception.EmailFormatException;

public class WomanUser extends User { 
	public WomanUser(UserKind kind) {
		super();
	}


	public void getUserInput(Scanner input) {
		setUserID(input); 
		setUserName(input); 

		
		char answer ='x';
		while (answer != 'y' && answer !='Y'&&answer != 'n' && answer !='N')
		{
			System.out.print("Do you have an email address? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer== 'y' || answer =='Y') {
					setUserEmail(input); 
				} 
				else if (answer =='n' || answer == 'N') {
					this.setEmail(" ");
				} 
				else {
					
				}
			}catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @ ");
			}
		}
		setUserPhone(input); 

	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("name: " + name + "id: "+ id + "email: " + "phone: " + phone);
	}
}

