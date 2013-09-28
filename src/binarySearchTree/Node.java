package binarySearchTree;

public class Node {

    private Node left;
    private Node right;
    private Node parent;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public void setLeftNode(Node node) {
        this.left = node;
    }

    public void setRightNode(Node node) {
        this.right = node;
    }

    public void setParentNode(Node node) {
        this.parent = node;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return left;
    }

    public Node getRightNode() {
        return right;
    }

    public Node getParentNode() {
        return parent;
    }

    public int getValue() {
        return value;
    }
}
