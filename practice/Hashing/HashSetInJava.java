package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("One");
		h.add("two");
		h.add("three");
		
		System.out.println(h);
		
		Iterator<String>i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String s:h) {
			System.out.println(s);
		}
			

	}

}
