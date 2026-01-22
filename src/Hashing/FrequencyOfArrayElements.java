package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		int[] arr= {15,12,13,12,13,13,18};
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int x:arr) {
			if(map.containsKey(x)) {
				map.put(x, (map.get(x))+1);
			}else {
				map.put(x, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}

	}

}
