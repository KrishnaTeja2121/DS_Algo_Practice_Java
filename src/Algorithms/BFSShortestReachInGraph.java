package Algorithms;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;



/* Implementation of an UNDIRECTED graph */
class Node{
	public final int id;// each Node will have a unique ID
	public int distance;// Also tells us if Node has been visited (-1 means unvisited)
	public HashSet<Node> neighbours;
	
	
	public Node(int id) {
		this.id=id;
		distance  = -1;
		neighbours = new HashSet();
	}
	
	public void addNeighbour(Node neighbour) {
		neighbours.add(neighbour);
		neighbour.neighbours.add(this);
	}
	
	
}


public class BFSShortestReachInGraph {

	private static final int EDGE_WEIGHT = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numQueries = scan.nextInt();
		
		for(int q=0; q<numQueries;q++) {
			int numNodes = scan.nextInt();
            int numEdges = scan.nextInt();
            
            //create Node
            Node[] node= new Node[numNodes + 1]; // array size declaration
            node[0]=null;// explicitly sets the unused index 0 to null, ensuring no accidental access.
            for(int i=1;i<numNodes;i++) {
            	node[i]=new Node(i);
            }
            
            // connecting edges
            for(int i=0;i<numEdges;i++) {
            	 int n1 = scan.nextInt();
                 int n2 = scan.nextInt();
                 node[n1].addNeighbour(node[n2]);
            }
            
            
            // create MST
            int start = scan.nextInt();
            findDistances(node[start]);
            
            /* Print results */
            for (int i = 1; i <= numNodes; i++) {
                if (i != start) {
                    System.out.print(node[i].distance + " ");
                }
            }
            System.out.println();
		}
		scan.close();
	}
	
	// Uses BFS to find min distance of each Node from "start"
	private static void findDistances(Node start) {
		if(start==null) {
			return;
		}
		
		ArrayDeque<Node> deque=new ArrayDeque();// use deque as a queue
		
		start.distance=0;
		
		deque.add(start);
		while(!deque.isEmpty()) {
			Node curr=deque.remove();
			for(Node neighbour:curr.neighbours) {
				if(neighbour.distance==-1) {//meaning it's unvisited
					neighbour.distance = curr.distance + EDGE_WEIGHT;
                    deque.add(neighbour);					
				}
				
			}
		}
		
	}

}
 