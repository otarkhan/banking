package framework_old2;

public abstract class ACustomer implements ICustomer {

	private long customerID = 0;
	private String firstName;
	private String lastName;
	private String email;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public ACustomer(String firstName, String lastName, String email, String street, String city,
			String state, int zip) {
		super();
		customerID++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	

	@Override
	public String toString() {
		return "ACustomer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
	
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}


	public String getCustomerInformation() {
		return this.toString();
	}
}
