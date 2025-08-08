public class BinarySearchTree {
    
    private Node root;

    public BinarySearchTree() {}

    public int height(Node node) {
        if (node == null) {
            return -1; // Height of an empty tree is -1
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            Node newNode = new Node(value);
            return newNode;
        }

        if (value < node.getValue()) {
            node.leftNode = insert(value, node.leftNode);
        }

        if (value > node.getValue()) {
            node.rightNode = insert(value, node.rightNode);
        }

        node.height = Math.max(height(node.leftNode), height(node.rightNode)) + 1;

        return node;
    }

    public boolean balanced(Node node) {
        if (node == null) {
            return true; // An empty tree is balanced
        }

        int leftHeight = height(node.leftNode);
        int rightHeight = height(node.rightNode);
    
        return Math.abs(leftHeight - rightHeight) <= 1 
            && balanced(node.leftNode) && balanced(node.rightNode);
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        
        System.out.print(node.getValue() + " ");
        preorderTraversal(node.leftNode);
        preorderTraversal(node.rightNode);
    }
    
    public void inorderTraversal() {
        inorderTraversal(root);
    }
    
    private void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        
        inorderTraversal(node.leftNode);
        System.out.print(node.getValue() + " ");
        inorderTraversal(node.rightNode);
    }
    
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.leftNode);
        postorderTraversal(node.rightNode);
        System.out.print(node.getValue() + " ");
    }
 
    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.leftNode, "Left child of " + node.getValue() + ": ");
        display(node.rightNode, "Right child of " + node.getValue() + ": ");
    }

    public class Node {
        private int value;
        private Node leftNode;
        private Node rightNode;
        private int height;
    
        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}