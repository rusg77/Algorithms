import binarySearchTree.BinarySearchTree;
import binarySearchTree.Node;

public class Main {

    public static void main(String[] args) {

        Node tree = BinarySearchTree.getMeTree();
        BinarySearchTree.inOrderTreeWalk(tree);

        System.out.print("Max depth: ");
        System.out.print(BinarySearchTree.getMaxDepth(tree));

    }
}
