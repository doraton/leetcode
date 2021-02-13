package binaryTreeMaximumPathSum;

import defaultDataStructure.TreeNode;

public class Solution {

    private int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        postorder(root);
        return ans;
    }

    private int postorder(TreeNode root) {
        if (null == root) return 0;
        final int l = Math.max(0, postorder(root.left));
        final int r = Math.max(0, postorder(root.right));
        ans = Math.max(ans, root.val + l + r);
        return root.val + Math.max(l, r);
    }
}
