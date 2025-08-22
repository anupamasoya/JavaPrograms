package interfaceexample;
 //multipleinheritance
public class Childclass1 implements Interfaceparent,Interfaceparent1{
 	public void method1() {
 		System.out.println("hello");
 	}
 	public void method2() {
 		System.out.println("hi");
	}

	public static void main(String[] args) {
	Childclass1 obj =new Childclass1();
	obj.method1();
 		obj.method2();
	}

 }
