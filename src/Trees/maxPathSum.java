package Trees;
import java.util.*;

public class maxPathSum {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int maxSum;

    static int maxGain(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftGain = Math.max(0, maxGain(root.left));

        int rightGain = Math.max(0, maxGain(root.right));

        int currentPath =
                root.val + leftGain + rightGain;

        maxSum = Math.max(maxSum, currentPath);

        return root.val +
                Math.max(leftGain, rightGain);
    }

    static int maxPathSum(TreeNode root) {

        maxSum = Integer.MIN_VALUE;

        maxGain(root);

        return maxSum;
    }

    public static void main(String[] args) {

        /*
                 -10
                 / \
                9  20
                  /  \
                 15   7
        */

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(
                "Maximum Path Sum: " +
                        maxPathSum(root)
        );
    }
}