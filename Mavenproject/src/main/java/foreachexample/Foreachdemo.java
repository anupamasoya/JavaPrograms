package foreachexample;

import java.util.ArrayList;
import java.util.List;

public class Foreachdemo {

	public static void main(String[] args) {
		List<String> n=new ArrayList<>();
		
		n.add("ANU");
		n.add("AJAY");
		n.add("HRIDYA");
		n.add("BLESSY");
		
		for(String name :n) {
			System.out.println(name);
		}
	}

}
