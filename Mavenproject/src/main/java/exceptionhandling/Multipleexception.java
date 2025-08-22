package exceptionhandling;

public class Multipleexception {

	public static void main(String[] args) {
		try {
			int a[]=new int[2];
			a[2]=3/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid:" + e);
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception occurs:" + e);
			
		}
		catch(Exception e) {
			System.out.println("parentclass:" +e);
		}

	}

}
