package upcasting;

public class Childclass extends Parentup{
	public void method1() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass  obj =new Childclass();
		obj.method1();
		Parentup o=new Childclass();
		o.method1();

	}

}
