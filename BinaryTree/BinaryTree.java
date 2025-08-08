package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree() {}

    public void populate(Scanner in) {
        System.out.println("Enter the value of the root node: ");
        int value = in.nextInt();

        root = new Node(value);

        populate(in, root);
    }

    private void populate(Scanner in, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = in.nextBoolean();

        if (left) {
            System.out.println("Enter the value of the left node of " + node.value);
            int leftValue = in.nextInt();
            node.leftNode = new Node(leftValue);
            populate(in, node.leftNode);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = in.nextBoolean();

        if (right) {
            System.out.println("Enter the value of the right node of " + node.value);
            int rightValue = in.nextInt();
            node.rightNode = new Node(rightValue);
            populate(in, node.rightNode);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        
        System.out.println(indent + node.value);
        display(node.leftNode, indent + "\t");
        display(node.rightNode, indent + "\t");
    }

    public class Node {
        int value;
        Node leftNode;
        Node rightNode;
    
        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        BinaryTree tree = new BinaryTree();

        tree.populate(in);

        System.out.println("The binary tree is:");
        tree.display();

        in.close();
    }
}