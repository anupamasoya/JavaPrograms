package multipleinheritance;

public class Multichild extends Multiinterchild{
	public void multimethod3()
	{
		System.out.println("welcome to multichild");
	}

	public static void main(String[] args) {
		Multichild obj =new Multichild();
		obj.multimethod3();
		obj.multimethod2();
		obj.multimethod1();

	}

}
