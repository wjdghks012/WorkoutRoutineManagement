import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserManager userManager = new UserManager(input); 
		
		int num = -1;
		
		
		while (num !=5) {

	    System.out.println(" ***PT User Management System Menu ***");
			
		System.out.println(" 1. Add User");
		
		System.out.println(" 2. Delete User");
	
		System.out.println(" 3. Edit User");
		
		System.out.println(" 4. View User ");
	
		System.out.println(" 5. Exit");
		
		System.out.println(" Select one number between 1-5: ");
		
		num = input.nextInt();
		
		if (num==1) {
			userManager.addUser();
		}
		if (num==2) {
			userManager.DeleteUser();
		}
		if (num==3) {
			userManager.EditUser();
		}
		if (num==4) {
			userManager.ViewUser();
		}
		else {
			continue;
		}
		
		}
		
	}
		
	
}
