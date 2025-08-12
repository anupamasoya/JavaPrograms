package singleinheritance;

public class SingleinheritanceChild extends SingleinheritanceParent {
	public void displayInfo()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleinheritanceChild obj = new SingleinheritanceChild();
		obj.display();
		obj.displayInfo();
	}

}
