package abstractioneg;

public class Abstractchild extends Abstractparent {
	public void method1() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		Abstractparent obj =new Abstractchild();
		obj.method1();
		obj.method2();

	}

}
