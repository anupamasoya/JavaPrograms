package collectiondemo;

import java.util.LinkedList;
import java.util.List;

public class Listmethods {

	public static void main(String[] args) {
		List<String>s=new LinkedList<String>();
		s.add("apple");
		s.add("kiwi");
		s.add("oranges");
		s.add("grapes");
		System.out.println(s);
		System.out.println(s.get(0));
		s.set(0,"pear");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.remove(0);
		System.out.println(s);
		System.out.println(s.contains("apple"));
		System.out.println(s.contains("kiwi"));
		System.out.println(s.indexOf("kiwi"));
		System.out.println(s.indexOf("grapes"));
		s.add("apple");
		System.out.println(s);
		System.out.println(s.lastIndexOf("apple"));
		
	}

}
