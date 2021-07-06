package app_users;

public class customer {

		public String firstName;
		public String lastName;
		public String userName;
		protected String socialnum;
		public String email;
		public String phonenum;
		public String password;
		
		
		public customer(String firstname, String lastname, 
				String username, String password, String social, 
				String email, String phone) {
			this.firstName = firstname;
			this.lastName = lastname;
			this.userName = username;
			this.password = password;
			this.socialnum = social;
			this.email = email;
			this.phonenum = phone;
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
		public String getPhone() {
			return this.phonenum;
		}
		
}
