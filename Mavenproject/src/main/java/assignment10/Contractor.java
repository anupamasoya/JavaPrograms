package assignment10;

class Contractor extends Employee{
	int hours;
	Contractor(double rate,int hour){
		this.paymentperhour=rate;
		this.hours = hour;
	}
	 double calculateSalary() {
		return paymentperhour * hours;
	}

}