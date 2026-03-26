package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class BinarySearchIceCreamParlour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 int t = scan.nextInt();
		 while(t-->0) {
			 int m = scan.nextInt();
			 int n = scan.nextInt();
			 int [] costs = new int[n];
			 for (int i = 0; i < n; i++) {
	                costs[i] = scan.nextInt();
	            }
			 buyIceCream(costs, m);
			 
		 }
		 scan.close();
		 
	}
	
	public static void buyIceCream(int [] costs, int money) {
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<costs.length;i++) {
			int icecreamID = i + 1;
            int cost       = costs[i];
            
            int othercost=money-cost;
            if(map.containsKey(othercost)) {
            	System.out.println(map.get(othercost) + " " + icecreamID);
            }
            map.putIfAbsent(cost, icecreamID);
		}
		
	}
}
