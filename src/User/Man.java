package User;

import java.util.Scanner;

public class Man extends User {
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
		System.out.print("Phone number : ");
		String phone = input.next();
		this.setPhone(phone);
	}

}
