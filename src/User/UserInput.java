package User;

import java.util.Scanner;

import exception.EmailFormatException;

public interface UserInput {
		public int getId();
		
		public void setId(int id);
			
		public void setName(String name);
		
		public String getName();
		
		public String getEmail();
		
		public void setEmail(String email) throws EmailFormatException;
		
		public String getPhone();
		
		public void setPhone(String phone);
		
		public void printInfo();
		
		public void setUserID(Scanner input);
		
		public void setUserName(Scanner input);
		
		public void setUserEmail(Scanner input) throws EmailFormatException;
		
		public void setUserPhone(Scanner input);
		
		public void getUserInput(Scanner input);

}
