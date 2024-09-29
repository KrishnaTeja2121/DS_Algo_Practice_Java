package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Hi");
		map.put(2, "Hello");
		map.put(3, "Bonjour");
		map.put(4, "cigsuiag");
		System.out.println(map);
		
		for(Map.Entry<Integer,String> e:map.entrySet()){
			System.out.println(e.getKey() + e.getValue());
		}


	}

}
