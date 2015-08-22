package com.company;

import java.util.Stack;

/**
 * Created by MrHu on 2015/8/14.
 */
public class BinarySearchTreeIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    public void findLeft(TreeNode root){
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }

    public BinarySearchTreeIterator(TreeNode root) {
        findLeft(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (stack.isEmpty()) return false;
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode now = stack.pop();
        if (now.right != null) findLeft(now.right);
        return now.val;
    }
}
