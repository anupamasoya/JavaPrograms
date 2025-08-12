package salary;

public class TotalSalary extends Calculate{
	public void slip(){
	double totalsalary = basicpay + hra - pf - deduction + bonus;
	
	System.out.println("Salary Slip");
	System.out.println("BASICPAY:" + basicpay);
	System.out.println("DEDUCTION:" + deduction);
	System.out.println("HRA:" + hra);
	System.out.println("PF:" + pf);
	System.out.println("BONUS:" + bonus);
	System.out.println();
	System.out.println("TOTALSALARY:" + totalsalary);
	}
	
	public static void main(String[] args) {
		TotalSalary c =new TotalSalary();
		c.setdetails(3000,2000,5000);
		c.calculate();
		c.slip();
	}

}
