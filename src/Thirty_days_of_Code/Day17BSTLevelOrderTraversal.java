package Thirty_days_of_Code;

import java.util.ArrayDeque;
import java.util.Scanner;

import Thirty_days_of_Code.Day16BinarySearchTree.Node;

public class Day17BSTLevelOrderTraversal {
	
	static class Node {
		Node left, right;
		int data;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	static void levelOrder(Node root) {
		if(root==null) {
			return;
		}
		ArrayDeque<Node> deque=new ArrayDeque<>();
		deque.add(root);
		while(!deque.isEmpty()) {
			Node n=deque.removeFirst();
			System.out.println(n.data + " ");
			if(n.left!=null) {
				deque.addLast(n.left);
			}
			if(n.right!=null) {
				deque.addLast(n.right);
			}
		}
	}
	
	public static Node insert(Node root, int data) {
		if(root==null) {
			return new Node(data);
		}else {
			Node cur;
			if(data <= root.data) {
				cur=insert(root.left, data);
				root.left=cur;
			}else {
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int T = sc.nextInt();
	        Node root = null;
	        while (T-- > 0) {
	            int data = sc.nextInt();
	            root = insert(root,data);
	        }
	        
	        levelOrder(root); 

	}

}
