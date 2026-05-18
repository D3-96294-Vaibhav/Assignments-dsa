package Question_3;


public class Q3 {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static void insertNodeBefore(Node head, Node temp, int val) {
		Node newNode = new Node(val);
		if(head.next == null) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node trav = head;
		while(trav != null) {
			if(temp.data == trav.next.data) {
				newNode.next = trav.next;
				trav.next = newNode;
				break;
			}
			trav = trav.next;
		}
		
		
		
		
	}
	public static void insertNodeAfter(Node head, Node temp, int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		
		Node trav = head;
		while(trav != null) {
			if(trav.data == temp.data) {
				newNode.next = trav.next;
				trav.next = newNode;
			}
			trav = trav.next;
		}
	}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		display(n1);
		
		System.out.println();
		
		System.out.println("Insert Before: ");

		insertNodeBefore(n1, n3, 100);
		
		display(n1);

		System.out.println();
		
		System.out.println("Insert After: ");
		
		insertNodeAfter(n1,n3,100);
		
		display(n1);
	}

}
