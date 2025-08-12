package polymorphism;

public class Compile {
		public  void method1() {
			System.out.println("hello");
		}
		public  void method1(int id,int age) {
			System.out.println("ID:" +id);
			System.out.println("AGE:" +age);
		}
		public void method1(float salary, String place) {
			System.out.println("SALARY:" +salary);
			System.out.println("PLACE:" +place);
		}

		public static void main(String[] args) {
			Compile c =new Compile();
			c.method1();
			c.method1(12,22);
			c.method1(2200f,"Kollam");

		}

	}


