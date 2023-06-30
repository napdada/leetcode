package q814;

import tree.TreeNode;

public class PruneTree {
    public static void main(String[] args) {

    }

    public static TreeNode pruneTree(TreeNode root) {
        dfs(root, root);
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    public static void dfs(TreeNode parent, TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node, node.left);
        dfs(node, node.right);
        if (node.val == 0 && node.left == null && node.right == null) {
            if (parent.left != null && parent.left == node) {
                parent.left = null;
            } else if (parent.right != null && parent.right == node) {
                parent.right = null;
            }
        }
    }
}
