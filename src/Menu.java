import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserManager userManager = new UserManager(input); 
		
		
		selectMenu(input,userManager);
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
				break;
			case 2:
				userManager.DeleteUser();
				break;
			case 3:
				userManager.EditUser();
				break;
			case 4:
				userManager.ViewUser();
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
}
