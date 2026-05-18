package Question_2;


public class Q2 {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static Node findKey(Node head, int key) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == key) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
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
		
		Node temp = findKey(n1, 20);
		if(temp != null) {
			System.out.println("Key is found");
		} else {
			System.out.println("Key does not exists");
		}

	}

}
