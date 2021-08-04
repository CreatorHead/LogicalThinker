package datastructures.stack;

public class StackUsingLinkedList {
	
	StackUsingLinkedList(int len){
		this.length = len;
	}
	class Node {
		Node(int data){
			this.data = data;
		}
		int data;
		Node next;
	}
	
	int length = 7;
	Node top;
	int currLen;
	
	
	public void push(int data) throws Exception {
		if((currLen) > length) throw new Exception("Stack Overflow");
		
		Node node = new Node(data);
		
		if(top == null) {
			currLen++;
			top = node;
		}
		
		node.next = top;
		top = node;
		currLen++;
	}
	
	public int pop() throws Exception {
		if((currLen) < 1) throw new Exception("Stack Underflow");
		int res = top.data;
		top = top.next;
		currLen--;
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		
		StackUsingLinkedList stack = new StackUsingLinkedList(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	

	
}
