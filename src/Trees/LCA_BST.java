package Trees;
//iterative approach of finding lowest common ancestos in a binary search tree...
public class LCA_BST {

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

        while (root != null) {

            // Both are smaller → go LEFT
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }

            // Both are larger → go RIGHT
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }

            // They split OR root is p/q
            else {
                return root;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        /*
                    50
                   /  \
                 30    70
                / \    / \
               20 40  60 80
        */

        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        TreeNode p = root.left.left;       // 20
        TreeNode q = root.left.right;      // 40

        TreeNode lca =
                lowestCommonAncestor(root, p, q);

        System.out.println("LCA: " + lca.val);
    }
}