package interfaceexample;
//abstraction
public class Childclass3 implements Interfaceabsparent{
	public void method() {
		System.out.println("java");
	}

	public static void main(String[] args) {
		Interfaceabsparent obj =new Childclass3();//upcasting
		obj.method();

	}

}
