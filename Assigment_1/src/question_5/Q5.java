package question_5;

public class Q5 {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static void display(Node tail) {
		Node temp = tail.next;
		while(temp != tail) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data + " -> ");
	}
	
	
	
	public static Node addFirst(Node tail, int val) {
		Node newNode = new Node(val);
		newNode.next = tail.next;
		tail.next = newNode;	
		return tail;
	}
	
	public static Node addLast(Node tail, int val) {
		Node newNode = new Node(val);
		newNode.next = tail.next;
		tail.next = newNode;
		tail = tail.next;
		return tail;
		
	}
	
	public static void deleteFirst(Node tail) {
		tail.next = tail.next.next;
	}
	
	public static Node deleteLast(Node tail) {		
		Node head = tail.next;
		Node curr = head;
		while(curr.next != tail) {
			curr = curr.next;
		}
		curr.next = head;
		tail = curr;
		return tail;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node tail = new Node(50);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = tail;
		tail.next = head;
		
		display(tail);
		
		System.out.println();
		
		Node s2 = addFirst(tail, 60);
		
		System.out.println();
		
		display(s2);
		
		System.out.println();
		
		Node s1 = addLast(tail, 70);
		
		System.out.println();
		
		display(s1);

		System.out.println();
		
		deleteFirst(s1);

		System.out.println();
		
		display(s1);
		
		System.out.println();
		
		Node n1 = deleteLast(s1);

		display(n1);
	}

}
