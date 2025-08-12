package superkeyword;

public class Superchild extends Superparent{
	int a=2;
	public void display1() {
		System.out.println(a);
		System.out.println(super.a);
	}


	public static void main(String[] args) {
		Superchild s = new Superchild();
		s.display1();
	}

}
