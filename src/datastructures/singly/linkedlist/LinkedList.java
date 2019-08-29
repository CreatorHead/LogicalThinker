package datastructures.singly.linkedlist;

public class LinkedList {
	private Node head;
	private int length;
	
	public void append(int data){
		if(head == null){
			head = new Node(data);
			length++;
			return;
		}
		Node current = head ;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
		length++;
	}
	
	public void append(int data, int position) {
		if(position == 0) {
			if(head == null) {
				head = new Node(data);
				length++;
				return;
			}
			Node newHead = new Node(data);
			newHead.next = head;
			head = newHead;
			length++;
			return;
		}
		if(position == length) {
			append(data);
			return;
		}
		if(position <= length-1) {
			Node currentNode = head;
			for(int i=0;i<=position;i++, currentNode=currentNode.next) {
				if(i == position-1) {
					Node node = new Node(data);
					node.next = currentNode.next;
					currentNode.next = node;
					length++;
					return;
				}
			}
			
		}
	}
	  
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		length++;
	}
	
	public void deleteWithValue(int data){
		if(head == null)return;
		if(head.data == data){
			head = head.next;
			length--;
		}
		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				length--;
				return;
			}
			current = current.next;
		}
	}
	
	public void traverse(){
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public int length() {
		return length;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(34);
		list.append(34);
		list.append(332);
		list.prepend(1);
		list.traverse();
		System.out.println("len: " + list.length());
		list.append(444, 4);
		System.out.println("len: " + list.length());
		list.traverse();
	}
}
