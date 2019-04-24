package bank;
import java.time.LocalDate;

import framework.*;

public class Person extends BankCustomer implements IPerson {
	private String birthday;

	public Person(String firstName, String lastName, String email, String street, String city, String state, int zip,String birthday) {
		super(firstName, lastName, email, street, city, state, zip);
	}

	@Override
	public String getCustomerInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ICustomer getCustomer() {
		return null;
	}

}
