package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		int[] arr= {15,12,13,12,13,13,18};
		int[] arr2= {30,15,8,12};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int x:arr) {
			h.add(x);
		}
		for(int x:arr2) {
			if(h.contains(x))
			System.out.println(x);
		}
		
		

	}

}
