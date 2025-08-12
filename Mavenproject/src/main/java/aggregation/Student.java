package aggregation;

public class Student {
	int stud_id;
	String stud_name;
	
	Student(int stud_id,String stud_name)
	{
		this.stud_id = stud_id;
		this.stud_name = stud_name;
	}
	public void display() {
		System.out.println("The details are:");
		System.out.println("STUID:" + stud_id);
		System.out.println("STUDNAME: " + stud_name);
	}

}
