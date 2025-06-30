package _03_esercizio_hash;

public class Email {
		
		private String username;
		private String password;
		
		public Email(String username, String password) {
			this.username = username;
			this.password = password;
		}
		
		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getPassword() {
			//implementation of password hash(you can use an algorithm like SHA-256)
			return String.valueOf(password.hashCode());
		}
		
		//setter method to set the password
		public void setPassword(String password) {
			this.password = password;
		}

		public String toString() {
			return "Email [username=" + username + ", password=" + getPassword() + "]";
		}
		
		
	}
