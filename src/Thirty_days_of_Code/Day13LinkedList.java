package Thirty_days_of_Code;

import java.util.HashMap;
import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

public class Day13LinkedList {
	
	
	public static Node insert(Node head, int data) {
		if(head==null) {
			return new Node(data);
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=new Node(data);
			return head;
		}
	}
	
	public static void display(Node head) {
		Node start= head;
		while(start !=null) {
			System.out.println(start.data + " ");
			start= start.next;
		}
	}
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Node head= null;
		int N=scan.nextInt();
		
		while(N-- >0) {
			int ele=scan.nextInt();
			head=insert(head,ele);
		}
		
		display(head);
		scan.close();
		

	}
	
	

}
