package Practice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueuePractice {
	
	int rear;
	int front;
	int[] a;
	int size;
	
	
	public QueuePractice(int size) {
		rear=-1;
		this.size=size;
		this.a=new int[size];
		
	}
	
	public void enqueue(int x) {
		rear++;
		a[rear]=x;
	}
	
	public int dequeue() {
		int ele=a[0];
		for(int i=0;i<rear;i++) {
			a[i]=a[i+1];
		}
		rear--;
		return ele;
	}

	public static void main(String[] args) {
		
		QueuePractice q=new QueuePractice(5);
		q.enqueue(4);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(9);
		q.enqueue(3);
		
		
		
		Queue<Integer> que= new ArrayDeque<>();
		que.add(15);
		que.add(12);
		que.add(9);
		que.add(7);
		que.add(20);
		que.remove();
		que.remove(20);
		System.out.println(que);
		
		Stack<Integer> stack1=new Stack<Integer>();
		while(!que.isEmpty()) {
			stack1.push(que.remove());
		}
		while(!stack1.isEmpty()) {
			que.add(stack1.pop());
		}
		System.out.println(que);
		

	}

}
