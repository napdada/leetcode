package q2236;

public class CheckTree {

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
