import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
		System.out.println(" 1. Add Routine");
		
		System.out.println(" 2. Delete Routine");
	
		System.out.println(" 3. Edit Routine");
		
		System.out.println(" 4. View Routine ");
	
		System.out.println(" 5. Show a menu");
	
		System.out.println(" 6. Exit");
		
		System.out.println(" Select one number between 1-6: ");
		
		
		
		num = input.nextInt();
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
}
