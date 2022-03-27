import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		int num = 5;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {

	    System.out.println(" ***Routine Management System Menu ***");
			
		System.out.println(" 1. Add Routine");
		
		System.out.println(" 2. Delete Routine");
	
		System.out.println(" 3. Edit Routine");
		
		System.out.println(" 4. View Routine ");
	
		System.out.println(" 5. Show a menu");
	
		System.out.println(" 6. Exit");
		
		System.out.println(" Select one number between 1-6: ");
		
		
		
		num = input.nextInt();
		if (num==1) {
			addRoutine();
		}
		if (num==2) {
	        DeleteRoutine();
		}
		if (num==3) {
	       EditRoutine();
		}
		if (num==4) {
	        ViewRoutine();
		}
		else {
			continue;
		}
		switch(num) {
		case 1: 
			System.out.print("User ID : ");
			int UserID = input.nextInt();
			System.out.print("Routine Part : ");
			String RoutinePart = input.next();
			break;
		case 2: 
		case 3: 
		case 4: System.out.print("Routine Part : ");
		String RoutinePart2 = input.next();
		}
		}
	}
		
	public static void addRoutine() {
			Scanner input = new Scanner(System.in);
			System.out.println("User ID : ");
			int UserID = input.nextInt();
			System.out.println("UserName : ");
			String UserName = input.nextLine();
			System.out.println(UserName);
			System.out.println("E-mail address : ");
			String UserEmail = input.next();
			System.out.println(UserEmail);
			System.out.println("Phone number : ");
			String UserPhone = input.next();
			
		}
	public static void DeleteRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.println("User ID : ");
		int UserID = input.nextInt();
	}
	public static void EditRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.println("User ID : ");
		int UserID = input.nextInt();
	
	}
	public static void ViewRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.println("User ID : ");
		int UserID = input.nextInt();
	}
	
}
