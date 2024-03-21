package model;

public class Node {
	
	private Integer content;
	private Node leftNode;
	private Node rightNode;
	
	public Node(Integer value) {
		this.content = value;
		leftNode = rightNode = null;
	}
	
	public Integer getValue() {
		return content;
	}
	public void setValue(Integer value) {
		this.content = value;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
}
