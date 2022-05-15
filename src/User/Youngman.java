package User;

import java.util.Scanner;

import exception.EmailFormatException;

public class Youngman extends User  {
	public Youngman(UserKind kind) {
		super();
	}

	public void getUserInput(Scanner input) {
		System.out.print("User ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("UserName : ");		
		String name = input.next();	
		this.setName(name);
		
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
