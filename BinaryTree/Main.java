// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // BinaryTree tree = new BinaryTree();
        // tree.populate(new Scanner(System.in));
        // tree.display();

        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {5, 3, 7, 2, 4, 6, 8};
        bst.populate(nums);
        // bst.display();

        System.out.println("Preorder Traversal:");
        bst.preorderTraversal();
        System.out.println();

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();
        System.out.println();

        System.out.println("Postorder Traversal:");
        bst.postorderTraversal();
        System.out.println();
    }
}
