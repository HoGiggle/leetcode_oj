package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by MrHu on 2015/8/16.
 */
public class BinaryTreePaths {
    public void addResult(TreeNode root, List<String> res){
        if (res == null) return;
        for (int i = 0; i < res.size(); i++){
            StringBuilder sb = new StringBuilder();
            sb.append(root.val);
            sb.append("->");
            sb.append(res.get(i));
            res.set(i, sb.toString());
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<String>();
        if (root == null) return res;

        List<String> left = null;
        if (root.left != null){
            left = binaryTreePaths(root.left);
        }
        List<String> right = null;
        if (root.right != null){
            right = binaryTreePaths(root.right);
        }

        if (left == null && right == null){
            res.add(root.val+"");
            return res;
        }else if (left == null){
            addResult(root, right);
            res.addAll(right);
        }else if (right == null){
            addResult(root, left);
            res.addAll(left);
        }else {
            addResult(root, left);
            addResult(root, right);
            res.addAll(left);
            res.addAll(right);
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreePaths b = new BinaryTreePaths();
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);

        root.left = n1;
        root.right = n2;
        n2.left = n3;

        for (String s : b.binaryTreePaths(root)){
            System.out.println(s);
        }
    }
}
