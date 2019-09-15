package datastructure.binary.tree.unballanced;

public class BinarySearchTreeUnbalanced {
	private Node root;

	public BinarySearchTreeUnbalanced(){}

	public BinarySearchTreeUnbalanced(int key) {
		add(key);
	}

	public int findLowestValue() {
		return findLowestNode(this.root).getKey();
	}

	public int findHigestValue() {
		return findHigestNode(this.root).getKey();
	}
	public Node findHigestNode(Node node) {
		if(this.root == null) {
			return null;
		}

		if(node != null) {
			if(node.getRight() != null) {
				return findHigestNode(node.getRight());
			}else {
				return node;
			}
		}else {
			return node;
		}
	}
	public Node findLowestNode(Node node) {
		if(this.root == null) {
			return null;
		}
		if(node != null) {
			if(node.getLeft() != null) {
				return findLowestNode(node.getLeft());
			}else {
				return node;
			}
		}else {
			return node;
		}
	}

	public boolean contains(int key) {
		return contains(root,key);
	}
	public boolean contains(Node node, int key) {
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

	public Node add(Node node, int key) {
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

	public void preOrder(Node node) {
		if(node != null) {
			preOrder(node.getLeft());
			System.out.println(node.getKey());
			preOrder(node.getRight());
		}
	}
	
	public void remove(int key) {
		Node node = this.root;
		remove(node,key);
	}

	public Node remove(Node node, int key) {
		if(this.root == null) {
			return null;
		}
		if(key == node.getKey()) {
			node = null;
			return node;
		}
		if(key < node.getKey()) {
			node.setLeft(remove(node.getLeft(),key));
		}else if(key > node.getKey()) {
			node.setRight(remove(node.getRight(),key));
			
		}else {
			return node;
		}
		return node;
	}
	@Override
	public String toString() {
		return "BinaryTreeUnbalanced [root=" + root + "]";
	}
}
