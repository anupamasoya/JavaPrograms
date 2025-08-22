package exceptionhandling;

public class TryCatchdemo {

	public static void main(String[] args) {
		try {
		int i =0;
		System.out.println("before division");
		System.out.println(i/0);
		}
		catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
			t.printStackTrace();
			System.out.println("after division");
		}
	}

}
