class Node {
	String data;
	Node next;

	public Node(String data) {
		this.data = data;
		this.next = null;
	}
}

public class TestExample1 {

	public static void main(String[] args) {
//		String str = "I am Pankaj";
//
//		String[] main = str.split(" ");
//
//		StringBuilder reversed = new StringBuilder();
//		for (int i = main.length - 1; i >= 0; i--) {
//			reversed.append(main[i] + " ");
//		}
//		System.out.println(reversed);

		Node head = new Node("A");
		head.next = new Node("B");
		head.next.next = new Node("C");
		head.next.next.next = new Node("D");
		head.next.next.next.next = new Node("E");

		
	}

	public static void print(Node node) {
		Node head = node;
		while (head.next != null) {
			System.out.println(head.data + " ");
		}
	}

	public static Node reverse(Node node) {
		Node head = node;
//		Node
		return null;
	}

}
