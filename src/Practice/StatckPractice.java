package Practice;

import java.util.Stack;

public class StatckPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		Stack<Integer> stack3=new Stack<Integer>();		
		
		System.out.println(stack1.empty());
		stack1.push(99);
		stack1.push(85);
		stack1.push(1);
		stack1.push(102);
		stack1.push(-1);	
		System.out.println(stack1);
		
		SortStack(stack1);
		System.out.println(stack1);
		
		
		
		
		
		
		
		/*
		
		int minele=stack1.peek();
		while(!stack1.isEmpty()) {
			int ele=stack1.peek();
			if(ele<minele) {
				minele=ele;
			}
			stack2.push(stack1.pop());
		}		
		System.out.println(minele);
		
		
		

		int index=3;
		int val=65;		
		insertIntoStack(index, stack1,stack2,val,stack1.size());		
		System.out.println(stack1);
		
		
		
		System.out.println(stack1);
		moveStack(stack1,stack2);
		moveStack(stack2,stack3);
		moveStack(stack3,stack1);		
		System.out.println(stack1);
		
		
	
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		int peekValue=stack1.peek();
		System.out.println("Peeked value :"+peekValue);
		System.out.println(stack1.contains(65));
		System.out.println(stack1.contains(50));
		stack1.insertElementAt(55, 3);
		System.out.println(stack1);
		
		
		*/
		
	}
	

	private static void SortStack(Stack<Integer> stack1) {
		Stack<Integer> tempStack=new Stack<Integer>();	
		
		while(!stack1.isEmpty()) {			
			int temp=stack1.pop();
			if(tempStack.isEmpty()) {
				tempStack.push(temp);
			}else {
				while(tempStack.peek()>temp && !tempStack.isEmpty()) {
					int val=tempStack.pop();
					stack1.push(val);				
				}
				tempStack.push(temp);				
			}			
		}
		moveStack(tempStack,stack1);
		
	}


	private static void insertIntoStack(int index, Stack<Integer> stack1, Stack<Integer> stack2, int val, int length) {
		for(int i=1;i<=(length-index);i++) {
			stack2.push(stack1.pop());						
		}
		stack2.push(val);
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		moveStack(stack2,stack1);
		
		
	}

	private static void moveStack(Stack<Integer> source, Stack<Integer> dest) {
		while (!source.isEmpty()) {
			dest.push(source.peek());
			source.pop();
		}		
	}

}
