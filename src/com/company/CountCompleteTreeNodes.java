package com.company;

import huawei.com.Main;

/**
 * Created by MrHu on 2015/8/11.
 */
public class CountCompleteTreeNodes {
    public int level(TreeNode root){
        int level = 0;
        while (root != null){
            level++;
            root = root.left;
        }
        return level;
    }

    public int midCountNodes(TreeNode root, int level){
        if (root == null) return 0;
        int rLevel = level(root.right);
        if ((level - 1) > rLevel){
            return (Math.max(2<<(rLevel-1),1) + midCountNodes(root.left, level-1));
        }else {
            return (Math.max(2<<(rLevel-1),1) + midCountNodes(root.right, level-1));
        }
    }

    public int countNodes(TreeNode root) {
        return midCountNodes(root, level(root));
    }

    public static void main(String[] args) {
        System.out.println(2<<-1);
    }
}
