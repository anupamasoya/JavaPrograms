package discount;

public class Onseason {
	public void discount(float price) {
		float discount =price - (price*0.40f);
		System.out.println("OnseasonDiscount:" + discount);
	}

}
