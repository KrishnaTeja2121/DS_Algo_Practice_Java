package Hashing;

import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		int[] arr= {3,3,3,3,3,3};
		int[] arr2= {3,3,3,};
		
		////
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int x:arr) {
			h.add(x);
		}
		for(int x:arr2) {
			h.add(x);
			
		}
		
		System.out.println(h.size());

	}

}
