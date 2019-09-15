package datastructure.binary.tree.unballanced;

public class BinaryTreeUnbalanced {
	private Node root;

	public BinaryTreeUnbalanced(){}

	public BinaryTreeUnbalanced(int key) {
		add(key);
	}

	public boolean contains(int key) {
		return contains(root,key);
	}
	private boolean contains(Node node, int key) {
		if(this.root == null) {
			return false;
		}
		if(node != null) {
			if(node.getKey() == key) {
				return true;
			}
			if(key < node.getKey()) {
				return contains(node.getLeft(),key);
			}else if(key > node.getKey()) {
				return contains(node.getRight(),key);
			}
			return false;
		}
		return false;
	}
	public Node getRoot() {
		return root;
	}
	public void add(int key) {
		if(this.root == null) {
			root = new Node(key);
			return;
		}
		Node node = root;
		add(node, key);
	}

	private Node add(Node node, int key) {
		if(node == null) {
			return new Node(key);
		}
		if(key < node.getKey()) {
			node.setLeft(add(node.getLeft(),key));
		}else if(key > node.getKey()){
			node.setRight(add(node.getRight(),key));
		}
		else{
			return node;
		}
		return node;
	}

	public void preOrder() {
		Node node = this.root;
		preOrder(node);
	}

	private void preOrder(Node node) {
		if(node != null) {
			preOrder(node.getLeft());
			System.out.println(node.getKey());
			preOrder(node.getRight());
		}
	}

	@Override
	public String toString() {
		return "BinaryTreeUnbalanced [root=" + root + "]";
	}

}
