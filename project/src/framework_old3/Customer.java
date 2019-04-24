package framework_old3;

public class Customer extends ACustomer {

	public Customer(long customerID, String firstName, String lastName, String email, String street, String city,
			String state, int zip) {
		super(firstName, lastName, email, street, city, state, zip);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ICustomer getCustomer() {
		// TODO Auto-generated method stub
		return this;
	}


}
