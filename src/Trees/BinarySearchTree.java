package Trees;

public class BinarySearchTree {
	static Node root;
	
	static class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int val) 
		{
			this.value=val;
		}
	}
	
	
	
	public static void insert(int val) {
		insertNode(root,val);
	}
	
	public static  BinarySearchTree.Node insertNode(Node root, int val) {
		
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(val < root.value) {
			root.left=insertNode(root.left,val);
		}
		else if(val>root.value) {
			root.right=insertNode(root.right,val);
		}
		return root;

	}

	public static void main(String[] args) {
		
		BinarySearchTree bs=new BinarySearchTree();
		BinarySearchTree.insert(6);
		BinarySearchTree.insert(1);
		BinarySearchTree.insert(3);
		BinarySearchTree.insert(0);
		BinarySearchTree.insert(8);
	}
	
	
	public void inordertraverse(Node root)
	{
		if(root!=null) {
			inordertraverse(root.left);	
			inordertraverse(root.value);
			inordertraverse(root.right);
		}
		
	}	
	
	

}
