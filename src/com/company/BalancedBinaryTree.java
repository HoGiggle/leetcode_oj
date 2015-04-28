package com.company;

/**
 * Created by jjhu on 2015/4/28.
 */
public class BalancedBinaryTree {
    public int depth(TreeNode root){
        if (root == null) return 0;
        return Math.max(depth(root.left) + 1, depth(root.right) + 1);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return ((Math.abs(depth(root.left) - depth(root.right))) > 1 ? false : true) && isBalanced(root.left) && isBalanced(root.right);
    }
}
