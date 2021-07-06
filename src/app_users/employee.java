package app_users;

public class employee {

	public String firstName;
	public String lastName;
	public String userName;
	public String email;
	
	
	public employee(String firstname, String lastname, String username, String email) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.userName = username;
		this.email = email;
	}
	
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
}
