package salary;

public class Calculate extends Salary {
	double hra;
	double pf;
	
	public void calculate() {
		hra = 0.05 * basicpay;
		pf = 0.20 * basicpay;
	}
	

}
