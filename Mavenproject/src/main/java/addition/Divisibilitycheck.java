package addition;

public class Divisibilitycheck extends Addresult{
	public void check(int a,int b) {
		int sum = super.add(a,b);
		if(sum%10==0) {
			System.out.println("divisible by 10");}
			else 
			System.out.println("not divisible by 10");
		
		}
	

	public static void main(String[] args) {
		Divisibilitycheck c =new Divisibilitycheck();
		c.check(77,15);
	}

}
