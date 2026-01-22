package Thirty_days_of_Code;

import java.util.Scanner;

public class Day_1_DataTypes {

	public static void main(String[] args) {
		
		int i=4;
		double d=1.4;
		String s="Elon musk";
		
		Scanner scan=new Scanner(System.in);
		
		int myInt;
		double myDouble;
		String myString;
		
		myInt=scan.nextInt();
		myDouble=scan.nextDouble();
		myString=scan.nextLine();
		
		System.out.println(i+ myInt);
		System.out.println(d+ myDouble);
		System.out.println(s+ myString);
		

	}

}
