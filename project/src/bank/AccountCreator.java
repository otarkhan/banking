package bank;
public class AccountCreator {

	public static AccountFactory createFactory(String name) {
		if (name == "Company") {
			return (new CompanyAccountFactory());
		}
		else {
			return (new PersonalAccountFactory());
		}
	}

}
