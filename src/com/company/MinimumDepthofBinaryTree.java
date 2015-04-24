package com.company;

/**
 * Created by jjhu on 2015/4/24.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        t.left = t1;

        MinimumDepthofBinaryTree m = new MinimumDepthofBinaryTree();
        System.out.println(m.minDepth(t));
    }
}
