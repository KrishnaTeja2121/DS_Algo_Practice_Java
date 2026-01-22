package Hashing;

import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {
		int[] arr= {15,12,13,12,13,13,18};
		
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		System.out.println(h.size());

	}

}
