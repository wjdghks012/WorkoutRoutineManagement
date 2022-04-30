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
		super();
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
	public void printInfo() {
		System.out.println("name: " + name + "id: "+ id + "email: " + "phone: " + phone);
	}

	public void getUserInput(Scanner input) {
		
	}
	
	
}
