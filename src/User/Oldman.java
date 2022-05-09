package User;

import java.util.Scanner;

public class Oldman extends User implements UserInput {
	public Oldman(UserKind kind) {
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
			if (answer== 'y' || answer =='Y') {
				System.out.println("Email address: ");
				String email = input.next();	
				this.setEmail(email);
			} 
			else if (answer =='n' || answer == 'N') {
				this.setEmail(" ");
			} 
			else {
				
			}
		}
		System.out.print("Protector's phone number : ");
		String phone = input.next();
		this.setPhone(phone);
	}
	public void printInfo() {
		switch(this.kind) {
		case Man: 
			skind = "Man";
			break;
		case Woman:
			skind = "Woman";
			break;
		case Youngman:
			skind = "Young";
			break;
		case Oldman:
			skind = "Old";
			break;
		default:
		
		}
		System.out.println("name: " + name + "id: "+ id + "email: " + "phone: " + phone);
	}
}
