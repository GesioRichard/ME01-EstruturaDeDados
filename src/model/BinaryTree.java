package model;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void insert(Integer content) {
		root = insert(root, content);
	}

	private Node insert(Node currentNode, Integer content) {

		if (currentNode == null) {
			return new Node(content);
		} else if (content < currentNode.getValue()) {
			currentNode.setLeftNode(insert(currentNode.getLeftNode(), content));
			
		} else {
			currentNode.setRightNode(insert(currentNode.getRightNode(), content));
		
		}

		return currentNode;
	}

	public void printTree() {
		System.out.println("Exibindo Árvore");
		printTree(this.root);
	}

	private void printTree(Node current) {
		if (current != null) {
			System.out.println("Valor: " + current.getValue());
			printTree(current.getLeftNode());
			printTree(current.getRightNode());

		}
	}

}
