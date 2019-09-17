package datastructure.binary.tree.unballanced;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		BinarySearchTreeUnbalanced tree = new BinarySearchTreeUnbalanced();
		tree.add(10);
		tree.add(5);
		tree.add(13);
		tree.add(3);
		tree.add(6);
		tree.add(11);
		tree.add(15);
		System.out.println("BFS: " + tree.breadthFirstSearch()
								.stream().map(n -> n.getKey()).collect(Collectors.toList()));
		System.out.println("Preorder");
		List<Node> node = tree.preOrder();
		for(Node n: node) {
			System.out.println(n.getKey());
		}
		System.out.println("Postorder");
		node = tree.postOrder();
		for(Node n: node) {
			System.out.println(n.getKey());
		}
		System.out.println("Inorder");
		node = tree.inOrder();
		for(Node n: node) {
			System.out.println(n.getKey());
		}
		
	}
}
