package Trees;

import java.util.*;

public class symmetricBT {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return mirror(root.left, root.right);
    }

    static boolean mirror(
            TreeNode left,
            TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return mirror(left.left, right.right)
                &&
                mirror(left.right, right.left);
    }

    public static void main(String[] args) {

        /*
                   1
                  / \
                 2   2
                / \ / \
               3  4 4  3
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(
                "Symmetric: " +
                        isSymmetric(root)
        );
    }
}