package bank;

public class User {
	int userpin;

	public static void main(String[] args) {
		Bank b = new Bank();
		 int userpin =1212;
		 
		 b.set_pin(userpin);
		 b.validate_pin();

	}

}
