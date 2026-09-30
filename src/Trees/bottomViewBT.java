package Trees;
import java.util.*;

public class bottomViewBT {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Pair {
        TreeNode node;
        int column;

        Pair(TreeNode node, int column) {
            this.node = node;
            this.column = column;
        }
    }

    static List<Integer> bottomView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            TreeNode node = current.node;

            int column = current.column;

            map.put(column, node.val);

            if (node.left != null) {
                queue.offer(
                        new Pair(node.left, column - 1)
                );
            }

            if (node.right != null) {
                queue.offer(
                        new Pair(node.right, column + 1)
                );
            }
        }

        result.addAll(map.values());

        return result;
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
                \   / \
                 4 5   6
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(
                "Bottom View: " +
                        bottomView(root)
        );
    }
}