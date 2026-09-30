import java.util.*;

public class childSumProperty {

    // Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Check Child Sum Property
    static boolean isSumProperty(TreeNode root) {

        // Case 1: Empty tree
        if (root == null) {
            return true;
        }

        // Case 2: Leaf node
        // Leaf has no children, so property is automatically satisfied
        if (root.left == null && root.right == null) {
            return true;
        }

        // Store left child value
        int leftValue = 0;

        // Store right child value
        int rightValue = 0;

        if (root.left != null) {
            leftValue = root.left.val;
        }

        if (root.right != null) {
            rightValue = root.right.val;
        }

        // Check:
        // Parent = Left Child + Right Child
        if (root.val != leftValue + rightValue) {
            return false;
        }

        // Check the left and right subtrees
        return isSumProperty(root.left)
                && isSumProperty(root.right);
    }

    public static void main(String[] args) {

        /*

                    10
                   /  \
                  4    6
                 / \  / \
                2  2 3  3

        Check:

        10 = 4 + 6   ✓
         4 = 2 + 2   ✓
         6 = 3 + 3   ✓

        Therefore answer = true
        */

        // Create root
        TreeNode root = new TreeNode(10);

        // Level 1
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);

        // Level 2
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        // Call function
        boolean result = isSumProperty(root);

        // Print result
        System.out.println("Child Sum Property: " + result);
    }
}