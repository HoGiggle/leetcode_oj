/*
package com.company;

*/
/**
 * Created by jjhu on 2015/4/24.
 *//*


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class PathSum {

    */
/*public boolean depthSearch(TreeNode root, int add, int sum){
        if (root.left == null && root.right == null){
            return (add + root.val) == sum;
        }else if (root.left == null && root.right != null){
            add += root.val;
            return depthSearch(root.right, add, sum);
        }else if (root.right == null && root.left != null){
            add += root.val;
            return depthSearch(root.left, add, sum);
        }else {
            add += root.val;
            return depthSearch(root.right, add, sum) || depthSearch(root.left, add, sum);
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return depthSearch(root, 0, sum);
    }*//*


    public boolean depthSearch(TreeNode root, int add, int sum){
        if (root == null) return false;

        if (root.left == null && root.right == null){
            return (add + root.val) == sum;
        }else {
            add += root.val;
            return depthSearch(root.right, add, sum) || depthSearch(root.left, add, sum);
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return depthSearch(root, 0, sum);
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        */
/*TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(7);
        t.left = t1;
        t.right = t2;

        t1.left = t3;
        t1.right = t4;

        t2.left = t5;
        t2.right = t6;*//*


        PathSum p = new PathSum();
        System.out.println(p.hasPathSum(t, 1));
    }
}
*/
