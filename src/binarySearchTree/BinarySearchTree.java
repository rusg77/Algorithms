package binarySearchTree;


public class BinarySearchTree {

    // вспомогательный метод построения дерева
    public static Node getMeTree() {
        Node tree = null;
        tree = BinarySearchTree.insertNode(tree, new Node(15));
        tree = BinarySearchTree.insertNode(tree, new Node(6));
        tree = BinarySearchTree.insertNode(tree, new Node(16));
        tree = BinarySearchTree.insertNode(tree, new Node(3));
        tree = BinarySearchTree.insertNode(tree, new Node(12));
        tree = BinarySearchTree.insertNode(tree, new Node(10));
        tree = BinarySearchTree.insertNode(tree, new Node(7));
        tree = BinarySearchTree.insertNode(tree, new Node(13));
        tree = BinarySearchTree.insertNode(tree, new Node(20));
        tree = BinarySearchTree.insertNode(tree, new Node(18));
        tree = BinarySearchTree.insertNode(tree, new Node(23));
        return tree;
    }

    // центрированный (симметричный) обход дерева
    public static void inOrderTreeWalk(Node root) {
        if (root != null) {
            inOrderTreeWalk(root.getLeftNode());
            System.out.print(root.getValue() + "  ");
            inOrderTreeWalk(root.getRightNode());
        }
    }

    // рекурсивный поиск узла дерева по значению
    public static Node searchNodeByValue(Node tree, int value) {
        if (tree == null || tree.getValue() == value) return tree;
        else if (value > tree.getValue())  return searchNodeByValue(tree.getRightNode(), value);
        else return searchNodeByValue(tree.getLeftNode(), value);
    }

    // нерекурсивный поиск узла дерева по значению
    public static Node searchNodeByValueWhile(Node tree, int value) {
        while (tree != null && tree.getValue() != value) {
            if (value < tree.getValue()) tree = tree.getLeftNode();
            else tree = tree.getRightNode();
        }
        return tree;
    }

    //  поиск минимального элемента в дереве
    public static Node getMinTreeNode(Node tree) {
        while (tree.getLeftNode() != null) {
            tree = tree.getLeftNode();
        }
        return tree;
    }

    // поиск максимального элемента в дереве
    public static Node getMaxTreeNode(Node tree, int i) {
        while (tree.getRightNode() != null) {
            tree = tree.getRightNode();
        }
        return tree;
    }

    // поиск последующего узла для данного узла узла
    public static Node getNodeSuccessor(Node node) {
        if (node.getRightNode() != null) {
            return getMinTreeNode(node.getRightNode());
        }
        Node y = node.getParentNode();
        while (y != null && y.getRightNode() == node) {
            node = y;
            y = y.getParentNode();
        }
        return y;
    }

    // TODO: поиск предшествующего узла для данного узла

    // вставка узла в дерево
    public static Node insertNode(Node tree, Node node) {
        // находим узел binarySearchTree, для которого node будет или левым или правым поддеревом
        Node y = null;
        Node x = tree;
        while (x != null) {
            y = x;
            if (x.getValue() > node.getValue()) {
                x = x.getLeftNode();
            } else x = x.getRightNode();
        }
        // x указывает в никуда, зато y указывает на нужный элнмент
        node.setParentNode(y);
        if (y == null) {    // если binarySearchTree - пустое
            tree = node;
        } else {
            if (node.getValue() > y.getValue()) {
                y.setRightNode(node);
            } else y.setLeftNode(node);
        }
        return tree;
    }


    // глубина дерева
    public static int getMaxDepth(Node tree) {
        if (tree == null) {
            return 0;
        }

        int max_left = getMaxDepth(tree.getLeftNode());
        int max_right = getMaxDepth(tree.getRightNode());

        if (max_left > max_right) return max_left + 1;
        else return max_right + 1;
    }
}
