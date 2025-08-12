package aggregation;

public class Studentdetails {
	
	String place;
	String country;
	
	Student obj;
	
	Studentdetails(String place, String country, Student obj)
	{
		this.place =place;
		this.country =country;
		this.obj=obj;
	}
	public void displayy() {
		System.out.println("PLACE:" + place);
		System.out.println("COUNTRY:" + country);
		System.out.println();
		obj.display();
	}

	public static void main(String[] args) {
		Student s =new Student(100, "anu");
		Studentdetails d = new Studentdetails("kollam","India",s);
		d.displayy();
		// TODO Auto-generated method stub

	}

}
