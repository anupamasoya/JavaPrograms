
public class HDFC implements RBI{
	public void recurringDeposit(double amount,int duration) {
		double principal = (amount * duration);
		double interest=(amount * duration * (duration + 1) / 2.0) * (interest_rate / 100) * (1.0/12);
		double maturityvalue= principal+interest;
		System.out.println("Maturityvalue:" +maturityvalue);
	}

	public static void main(String[] args) {
		HDFC h =new HDFC();
		h.recurringDeposit(5000,12 );
	}

}
