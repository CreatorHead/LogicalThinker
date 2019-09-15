package datastructure.binary.tree.unballanced;

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
		System.out.println(tree.contains(6));
		tree.remove(6);
		System.out.println(tree.contains(6));
	}
}
