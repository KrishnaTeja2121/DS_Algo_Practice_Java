package Thirty_days_of_Code;

import java.util.Scanner;

public class Day4ClassvsInstance {
	
	private int age;
	
	public Day4ClassvsInstance(int initialAge) {
		age=initialAge;
		if(age < 0) {
			 System.out.println("Age is not valid, setting age to 0.");
	            age = 0;
		}
	}
	
	public void amIOld() {
		 if (age < 13) {
	            System.out.println("You are young.");
	        } else if (age >= 13 && age < 18) {
	            System.out.println("You are a teenager.");
	        } else {
	            System.out.println("You are old.");
	        }
	}
	public void yearPasses() {
        age++;
    }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 int T = scan.nextInt();
		 for(int i=0;i<T;i++) {
			 int age=scan.nextInt();
			 Day4ClassvsInstance p = new Day4ClassvsInstance(age);
			 p.amIOld();
	            for (int j = 0; j < 3; j++) {
	                p.yearPasses();
	            }
	            p.amIOld();
	            System.out.println();
			 }
		 scan.close();
		
	}

}
