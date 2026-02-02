package Thirty_days_of_Code;

import java.util.HashMap;
import java.util.Scanner;


abstract class Book{
	String title;
	String author;
	Book(String t, String a){
		title=t;
		author=a;
	}
	abstract void display();
}

class MyBook extends Book{
	int price;
	
	MyBook(String t, String a, int price){
		super(t,a);
		this.price=price;
	}

	@Override
	void display() {
		System.out.println("Title: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);

	}
}


public class Day12AbstractClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price=scan.nextInt();
        
        Book new_novel= new MyBook(title, author, price);
        new_novel.display();
        
    }
}
