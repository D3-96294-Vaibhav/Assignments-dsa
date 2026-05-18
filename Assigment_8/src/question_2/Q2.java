package question_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Graph {
	private int vertexCount, edgeCount;
	private boolean adjMat[][];
	
	public Graph(int v) {
		vertexCount = v;
		adjMat = new boolean[v][v];
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjMat[src][dest] = true;
			adjMat[dest][src] = true;	
		}
	}
	
	public void print() {
		System.out.println("Vertex count = " + vertexCount);
		System.out.println("Edge count = " + edgeCount);
		System.out.println("Graph : ");
		for(int u = 0 ; u < vertexCount ; u++) {
			for(int v = 0 ; v < vertexCount ; v++) {
				System.out.print(" " + (adjMat[u][v] ? "1" : "0"));
			}
			System.out.println("");
		}
	}
	
	public void DFSTraversal(int start) {
		Stack<Integer> st = new Stack<Integer>();
		boolean marked[] = new boolean[vertexCount];
		st.push(start);
		marked[start] = true;
		System.out.print("DFS Traversal : ");
		while(!st.isEmpty()) {
			int u = st.pop();
			System.out.print(" " + u);
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjMat[u][v]) {
					st.push(v);
					marked[v] = true;
				}
			}
		}
		System.out.println("");
	}
	
	public void BFSTraversal(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean marked[] = new boolean[vertexCount];
		q.offer(start);
		marked[start] = true;
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(" " + u);
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjMat[u][v]) {
					q.offer(v);
					marked[v] = true;
				}
			}
		}
		System.out.println("");
	}
	

}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter vertex count : ");
		int count = sc.nextInt();
		
		Graph g = new Graph(count);
		
		g.accept(sc);
		g.print();
		
		g.DFSTraversal(0);
		g.BFSTraversal(0);
		
		sc.close();

	}

}
