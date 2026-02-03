package Thirty_days_of_Code;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;


class Printer<T>{
	public void printArray(T[] array) {
		for(T item: array) {
			System.out.println(item);
		}
	}
}

public class Day15Generics {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scan.nextInt();
        }
        
        
        n = scan.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scan.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
        	

	}
}
