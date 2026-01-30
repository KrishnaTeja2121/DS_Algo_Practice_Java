package Thirty_days_of_Code;

import java.util.HashMap;
import java.util.Scanner;

class Person{
	
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int idNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.idNumber=idNumber;
		
	}
	
	public void printPerson() {
		 System.out.println(
	                "Name: " + lastName + ", " + firstName 
	            +   "\nID: " + idNumber);
	}
}

class Student extends Person{
	private int[] testScore;
	
	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName,lastName, id);
		testScore=scores;
	}
	public char calculate() {
        double average = 0;
        for (int score : testScore) {
            average += score;
        }
        average /= testScore.length;
        
        if  (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }

}



public class Day11Inheritance {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }


}
