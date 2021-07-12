package app_users;

import java.util.Scanner;

public class customer {
	Scanner scan = new Scanner(System.in);
	
		//fields
		private String firstName;
		private String lastName;
		private String userName;
		private String password;
		private String socialnum;
		private String email;
		private String phonenum;
		private int balance; 
			
		
		//constructors
		public customer() {
			System.out.println("New Customer Created!");
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
		public String getBalance() {
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
		public void setSocial(String social) {
			this.socialnum = social;
		}
		public void setPhone(String num) {
			this.phonenum = num;
		}
		
}
