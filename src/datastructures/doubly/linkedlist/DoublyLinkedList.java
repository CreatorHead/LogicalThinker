package datastructures.doubly.linkedlist;

public class DoublyLinkedList {
	Node head;
	Node tail;
	private int length;

	public void add(int data) {
		if(head == null) {
			head = new Node(data);
			length++;
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(data,currentNode,null);
		currentNode.next.prev = currentNode;
		tail = currentNode.next;
		length++;
	}
	
	public void add(int data, int position) {
		if(position > length) return;
		if(position == 0) {
			Node newNode = new Node(data);
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			length++;
			return;
		}
		if(position == length) {
			add(data);
			return;
		}
		
		if(position <= length-1) {
			Node currentNode = head;
			for(int i= 0;i<= position;i++, currentNode = currentNode.next) {
				if(i == position) {
					Node newNode = new Node(data,null,null);
					newNode.next = currentNode;
					newNode.prev = currentNode.prev;
					currentNode.prev = newNode;
					newNode.prev.next = newNode;
					length++;
					return;
				}
			}
		}
	}

	public void remove(int position) {
		if(position >=length) {
			return;
		}
		if(position == 0) {
			Node currentNode = head;
			head = currentNode.next;
			currentNode.next = null;
			head.prev = null;
			length--;
			return;
		}
		
		if(position == length-1) {
			Node currentNode = tail;
			tail = currentNode.prev;
			currentNode.prev = null;
			tail.next = null;
			length--;
			return;
		}
		if(position <= length-2) {
			Node currentNode = head;
			System.out.println("Head: " + currentNode.data);
			for(int i=1;i<=length-2;i++,currentNode = currentNode.next ) {
				if(position == i) {
					currentNode.prev.next = currentNode.next;
					currentNode.next.prev = currentNode.prev;
					currentNode.prev = null;
					currentNode.next = null;
					length--;
					return;
					
				}
			}
		}
	}
	
	public void traverse() {
		Node currentNode = head;
		if(head == null) {
			return;
		}
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	public void reverseTraverse() {
		Node currentNode = tail;
		if(tail == null) {
			return;
		}
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.prev; 
		}
	}

	public int getPosition(int data) {
		int position = -1;
		boolean found = false;
		Node currentNode = head;
		while(currentNode != null) {
			position++;
			if(currentNode.data == data) {
				found = true;
				return position;
			}
			currentNode = currentNode.next;
		}
		if(found == false) {
			position = -1;
		}
		return position;
	}
	
	public int length() {
		return length;
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println("traverse");
		list.traverse();
		System.out.println("Head: " + list.head.data);
		System.out.println("Tail: " + list.tail.data);
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("Position of 7: " + list.getPosition(7));
		System.out.println("Position of 99: " + list.getPosition(99));
		System.out.println("Adding 8 in the head position");
		list.add(8,0);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("Adding 11 at the end of list");
		list.add(11,4);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("adding node in position: 3 and value = 13");
		list.add(13,3);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("Remove first node from the list");
		list.remove(0);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("Removing the last node from the list");
		list.remove(list.length-1);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("Removing index which is not present");
		list.remove(4);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
		System.out.println("removing a node from the list Posintion: 2");
		list.remove(2);
		System.out.println("traverse");
		list.traverse();
		System.out.println("reverse Traverse");
		list.reverseTraverse();
		System.out.println("length: " + list.length());
	}
}
