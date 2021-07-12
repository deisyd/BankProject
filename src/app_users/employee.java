package app_users;

public class employee {
	
	//fields
		private String firstName;
		private String lastName;
		private String userName;
		private String password;
		private String email;
		
		//constructors
		public employee() {
			System.out.println("New Employee Created!");
		}
		
		// getters and setters
		public String getFirstName() {
			return firstName;
		}
		public String getFullName() {
			return firstName + " " + lastName;
		}
		public String getEmail() {
			return email;
		}
		public String getUserName() {
			return userName;
		}
		
		public void setFirstName(String first) {
			this.firstName = first;
		}
		
		public void setLastName(String last) {
			this.lastName = last;
		}
		public void setUserName(String user) {
			this.userName = user;
		}
		public void setPass(String pass) {
			this.password = pass;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
}
