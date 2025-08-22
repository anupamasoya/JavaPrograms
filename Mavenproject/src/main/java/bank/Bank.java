package bank;

public class Bank {
	private int pin;
	public void set_pin(int pin) {
		this.pin=pin;
		}
	public void validate_pin() {
		if(pin == 1001 || pin == 1234 || pin ==1212) {
			System.out.println("withdraw money");
		}else {
			System.out.println("not withdraw money");
		}
	}

}
