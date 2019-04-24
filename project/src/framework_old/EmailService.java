package framework_old;

public class EmailService implements IService {
	
	private String email = "";

	@Override
	public void update(IOperation operation) {
		// TODO Auto-generated method stub
	
	}
	
	
	private void sendEmail() {
		System.out.println("Sending email : "+email);
	}
}
