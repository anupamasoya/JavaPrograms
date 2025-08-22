package discount;

public class Offseason extends Onseason{  //overriding
	public void discount(float price) {
		float discount = price - (price*0.15f); //15%discount
		System.out.println("Offseason price:" + discount);
	}

	public static void main(String[] args) {
		float price =2000f;
		Offseason obj=new Offseason();
		obj.discount(price);
		
		Onseason o =new Onseason();
		o.discount(price);
	}

}
