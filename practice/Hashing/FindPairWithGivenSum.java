package Hashing;

import java.util.HashSet;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		int[] arr= {3,2,8,15,-8};
		int sum=17;
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int x:arr) {
			if(h.contains(sum-x)) {
				System.out.println("True");
				break;
			}else {
				h.add(x);	
			}
		}

	}

}
