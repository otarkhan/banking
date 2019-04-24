package bank;
import framework.*;


public class Company extends BankCustomer implements ICompany {
	private int numberOfEmployees;
	
	public Company(String firstName, String lastName, String email, String street, String city, String state, int zip,int numberOfEmployees) {
		//this.numberOfEmployees = numberOfEmployees;
		super(firstName, lastName, email, street, city, state, zip);
	}

	@Override
	public ICustomer getCustomer() {
		return this;
	}

	@Override
	public String getCustomerInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
