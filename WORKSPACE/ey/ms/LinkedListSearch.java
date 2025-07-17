package com.ey.ms;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	// Insert a new node at the end
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Find a node with a specific value
	public boolean find(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key) {
				return true; // Node found
			}
			temp = temp.next;
		}
		return false; // Node not found
	}

	// Print the linked list
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}

public class LinkedListSearch {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);

		list.display();

		int searchKey = 30;
		if (list.find(searchKey)) {
			System.out.println("Node " + searchKey + " found in the linked list.");
		} else {
			System.out.println("Node " + searchKey + " not found.");
		}
	}
}
