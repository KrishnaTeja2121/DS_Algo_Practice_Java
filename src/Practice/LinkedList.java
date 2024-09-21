package Practice;

public class LinkedList {
	
	class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val=val;
		}
		
	}	
	
	static Node head=null;
	static Node tail=null;
	
	public void addNodeAtEnd(int val) {
		
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			newNode.next=null;
			tail=newNode;
		}		
	}	
	public void addNodeAtBeginning(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	public  void addNodeAtGivenPosition(int val, int pos) {
		Node newNode=new Node(val);
		if(head==null && pos==0) {
			head=newNode;
		}else {
			Node curr=head;
			for(int i=1;i<pos-1;i++) {
				curr=curr.next;
			}
			newNode.next=curr.next;
			curr.next=newNode;
		}
		
	}
	public static void printLinkedList(Node headNode) {
		Node curr=headNode;
		do {
			System.out.println(curr.val);
			curr=curr.next;
		}while(curr!=null) ;
	}
	public static void deleteNodeAtEnd() {
		Node curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		tail=curr;
		
	}
	public static void deleteNodeAtFirst() {
		head=head.next;		
	}
	
	public static void reverseLinkedList() {
		Node next=null;
		Node prev=null;
		Node curr=head;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;			
		}
		printLinkedList(prev);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addNodeAtEnd(10);
		ll.addNodeAtEnd(20);
		ll.addNodeAtEnd(30);
		ll.addNodeAtBeginning(0);
		ll.addNodeAtGivenPosition(55,3);
		ll.addNodeAtEnd(95);		
		printLinkedList(head);
		deleteNodeAtEnd();
		deleteNodeAtFirst();
		printLinkedList(head);
		reverseLinkedList();

	}

}
