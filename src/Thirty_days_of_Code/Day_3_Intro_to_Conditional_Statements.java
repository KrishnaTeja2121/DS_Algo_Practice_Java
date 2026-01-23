package Thirty_days_of_Code;

import java.util.Scanner;

public class Day_3_Intro_to_Conditional_Statements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        /* Determine answer */
        String ans = "";
        if (n % 2 == 1) {
            ans = "Oh";
        } else {
            if (n >= 6 && n <= 20) {
                ans = "Oh NO ";
            } else {
                ans = "Ok Fine";
            }
        }
        
        /* Print output */
        System.out.println(ans);

	}

}
