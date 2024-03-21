package main;

import model.BinaryTree;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(6);
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(3);
		tree.insert(8);

		tree.printTree();
	}

}
