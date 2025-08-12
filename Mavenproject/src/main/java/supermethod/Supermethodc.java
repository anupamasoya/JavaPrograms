package supermethod;

public class Supermethodc extends Supermethodp{
	public void display() {
		System.out.println("hi");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermethodc c =new Supermethodc();
		c.display();

	}

}
