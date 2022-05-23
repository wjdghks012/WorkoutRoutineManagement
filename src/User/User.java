package User;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class  User implements UserInput, Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8132819895313782277L;
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
	public User(String name, int id, String email, String phone, UserKind kind) {
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

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	String skind = "none";
	public abstract void printInfo();
	
	public void setUserID(Scanner input) {
		System.out.println(" User ID: ");
		int id = input.nextInt();
		this.setId(id);
		
	}
	public void setUserName(Scanner input) {
		System.out.println(" User Name: ");
		String name = input.next();
		this.setName(name);	
		
	}
	public void setUserEmail(Scanner input) {
		String email="";
		while(!email.contains("@")) {
			
			System.out.println(" Email address: ");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {		
				System.out.println("Incorrect Email Format. put the e-mail address that contains @ ");
			}
		}
	}
	public void setUserPhone(Scanner input) {
		System.out.println(" Phone number: ");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public String getKindString() {
		String skind = "none";
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
		return skind;
	
	}
}
