package classes;

public class Address{
	String address;
	
	    void details(Student r) {
		System.out.println("NAME:" +r.name);//r.name mean we should get the name from stud object
		System.out.println("rollnumber:" +r. roll_no);
		System.out.println("ADDRESS:" +address);
	}
	    
public static void main(String[] args) {
	Student r =new Student();//create student object
	r.name="anupama";
	r.roll_no=28;
	
	Address d =new Address();//created address object
	d.address="KLM";
	d.details(r);
}
}
