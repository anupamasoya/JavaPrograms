package assignment10;

public class Fulltimeemployee extends Employee {
	Fulltimeemployee(double rate){
		this.paymentperhour=rate;
	}
	double calculateSalary() {
		return paymentperhour * 8;
	}

	public static void main(String[] args) {
		Employee c = new Contractor(500,6);
		Employee f = new Fulltimeemployee(500);
		System.out.println("contractor salary:" +c.calculateSalary());
		System.out.println("full time salary:" +f.calculateSalary());
	
}
}