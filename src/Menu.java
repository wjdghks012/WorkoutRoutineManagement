import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserManager userManager = new UserManager(input); 
		
		int num = -1;
		
		
		while (num !=5) {

	    System.out.println(" ***Routine Management System Menu ***");
			
		System.out.println(" 1. Add Routine");
		
		System.out.println(" 2. Delete Routine");
	
		System.out.println(" 3. Edit Routine");
		
		System.out.println(" 4. View Routine ");
	
		System.out.println(" 5. Exit");
		
		System.out.println(" Select one number between 1-5: ");
		
		num = input.nextInt();
		
		if (num==1) {
			userManager.addRoutine();
		}
		if (num==2) {
			userManager.DeleteRoutine();
		}
		if (num==3) {
			userManager.EditRoutine();
		}
		if (num==4) {
			userManager.ViewRoutine();
		}
		else {
			continue;
		}
		
		}
		
	}
		
	
}
