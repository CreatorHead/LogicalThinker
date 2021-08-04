package datastructures.queue;

public class Queue {
	
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}

	
	private Node head; 
	private Node tail;
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int peek(){
		return head.data;
	}
	
	public void add(int data){
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		
		tail.next = node;
		tail = node;
		
	}
	
	public int remove(){
		int data = head.data;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return data;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}
