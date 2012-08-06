package springapp.domain;

public class User {
	private String firstName;
	private String lastName;
	private String userID;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String userID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}
