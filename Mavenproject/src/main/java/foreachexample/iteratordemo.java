package foreachexample;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class iteratordemo {

	public static void main(String[] args) {
		List<String>s=new LinkedList<String>();
		s.add("red");
		s.add("blue");
		s.add("pink");
		
		System.out.println(s);
		
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(s);
	}

}
