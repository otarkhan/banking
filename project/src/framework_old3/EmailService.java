package framework_old3;

public class EmailService implements IService {
	
	private String email = "";

	@Override
	public void update(ICustomer customer,double amount,String operation) {
		// TODO Auto-generated method stub
	email += customer.getFirstName()+" "+customer.getLastName()+" did a "+operation+" of "+amount+" \n"
			+ "Sending email to : "+customer.getEmail();
	}
	
	
	private void sendEmail() {
		System.out.println("Sending email : "+email);
	}
}
