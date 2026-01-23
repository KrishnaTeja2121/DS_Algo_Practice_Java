package Thirty_days_of_Code;

import java.util.Scanner;

public class Day_1_DataTypes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the MealCost\n");
		double mealCost=scan.nextDouble();
		System.out.println("Enter the Tax Percent\n");
		int taxPercent= scan.nextInt();
		System.out.println("Enter the Tip Percent\n");
		int tipPercent= scan.nextInt();
		
		scan.close();
		
		int totalCost= (int) Math.round(mealCost + mealCost *taxPercent/100 + mealCost *tipPercent/100);
		
		System.out.println(totalCost+"\n");

	}

}
