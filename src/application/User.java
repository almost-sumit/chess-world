package application;

public class User implements UserInterface {
	
	private String userId;
	
	private String userName;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	@Override
	public String createAccount() {
		return this.userId;
	}
	
	@Override
	public boolean deleteAccount() {
		return true;
	}

}
