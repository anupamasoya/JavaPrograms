package exceptionhandling;

public class Exceptionhandling {
	

	public static void main(String[] args) {
		try
		{
			int a=2/0;
		System.out.println("A:" +a);
		}
		/*catch(ArithmeticException e) {
			System.out.println("E:" +e);
		}*/
		finally {
			System.out.println("finally:");
		}
		
	}

}
