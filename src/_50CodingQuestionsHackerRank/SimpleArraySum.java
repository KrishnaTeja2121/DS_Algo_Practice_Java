package _50CodingQuestionsHackerRank;

import java.util.Scanner;

/*
 * Problem: Given an array of integers, find the sum of its elements.

   Inputs: The first line contains an integer n, denoting the size of the array.

   The second line contains n space-separated integers representing the array’s elements.

   Outputs: Print the sum of the array’s elements as a single integer.
 * 
 * */

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size\n");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int arr[]=new int[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter input "+i +'\n');
				arr[i]= in.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Output sum is: "+sum);

	}

}
