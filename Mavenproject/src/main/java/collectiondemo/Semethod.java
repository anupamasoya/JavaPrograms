package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class Semethod {

	public static void main(String[] args) {
		Set<String>s=new HashSet<String>();
		Set<String> a=new HashSet<String>();
		
		s.add("apple");
		s.add("orange");
		s.add("plum");
		
		a.add("blue");
		a.add("red");
		a.add("yellow");
		
		System.out.println(s);
		System.out.println(a);
		
		s.addAll(a);
		System.out.println(s);
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		
		
	}

}
