package com.company;

/**
 * Created by MrHu on 2015/7/27.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null){
            if (p == null && q == null) return true;
            return false;
        }
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
