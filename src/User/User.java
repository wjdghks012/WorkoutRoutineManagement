package User;

import java.util.Scanner;

public class User {	
	protected UserKind kind = UserKind.Man;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	
	public User() {
		
	
	}
	
	public User(String name, int id) {
		super();
		this.name = name;
		this.id= id;
		
	}
	public User(String name, int id, String email, String phone) {
		this.kind = kind;
		this.name = name;
		this.id= id;
		this.email=email;
		this.phone= phone;

	}
	
	public UserKind getKind() {
		return kind;
	}

	public void setKind(UserKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	String skind = "none";
	public void printInfo() {
		switch(this.kind) {
		case Man: 
			skind = "Man";
			break;
		case Woman:
			skind = "Woman";
			break;
		case under15:
			skind = "Young";
			break;
		case upper65:
			skind = "Old";
			break;
		default:
		
		}
		System.out.println("name: " + name + "id: "+ id + "email: " + "phone: " + phone);
	}

	public void getUserInput(Scanner input) {
		System.out.print("User ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("User name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Email address: ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("Phone number: ");
		String phone = input.next();
		this.setPhone(phone);
		
	}
	
	
}
