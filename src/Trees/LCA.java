package Trees;

import java.util.*;

public class LCA {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left =
                lowestCommonAncestor(
                        root.left, p, q
                );

        TreeNode right =
                lowestCommonAncestor(
                        root.right, p, q
                );

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        if (right != null) {
            return right;
        }

        return null;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode p = root.left.left;
        TreeNode q = root.left.right;

        TreeNode answer =
                lowestCommonAncestor(
                        root, p, q
                );

        System.out.println(
                "LCA: " + answer.val
        );
    }
}