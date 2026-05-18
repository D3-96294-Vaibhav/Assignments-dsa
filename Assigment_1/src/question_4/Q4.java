package question_4;

public class Q4 {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static Node insertNode(Node head, int val) {
		Node newNode = new Node(val);
		
		if(head == null || val < head.data) {
			newNode.next = head;
			return newNode;
		}
		
		Node curr = head;
		while(curr.next != null && curr.next.data < val) {
			curr = curr.next;
		}
		
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
		
	}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		 	Node head = null;
			head = insertNode(head, 10);
	        head = insertNode(head, 5);
	        head = insertNode(head, 1);
	        head = insertNode(head, 20);
	        head = insertNode(head, 15);
		
	        display(head);	
		
		
	}
}
