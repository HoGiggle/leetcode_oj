package com.company;

/**
 * Created by MrHu on 2015/8/5.
 */
public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null){
            return root;
        }else if (left != null){
            return left;
        }else if (right != null){
            return right;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        char a = '\u0001';
        char b = '2';
        System.out.println(a - '0');
        System.out.println(b - '0');
        System.out.println(b - a);
        System.out.println(1 - '0');
        System.out.println('a' - '0');
    }
}
