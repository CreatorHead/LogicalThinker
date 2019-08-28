package datastructures.linkedlist;

public class LinkedList {
	Node head;
	public void append(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head ;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}
	  
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data){
		if(head == null)return;
		if(head.data == data){
			head = head.next;
		}
		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
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
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(34);
		list.append(34);
		list.append(332);
		list.prepend(1);
		list.traverse();
		System.out.println("**************");
		list.deleteWithValue(332);
		list.traverse();
	}
}
