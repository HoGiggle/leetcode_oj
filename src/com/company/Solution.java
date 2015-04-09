/*
package com.company;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by jjhu on 2014/11/27.
 *//*

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public List<Integer> depthOrderTraversal(TreeNode root){
        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
        List<Integer> valList = new ArrayList<Integer>();

        while(!stack.isEmpty() || root != null){//中序遍历
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            valList.add(root.val);
            root = root.right;
        }
        return valList;
    }

    public boolean isSymmetric(TreeNode root) {
       if(root != null && root.val != 0){
           List<Integer> val = depthOrderTraversal(root);
           int i, j;         //为了区分节点数为偶数情况，偶数为错误情况
           for(i = 0, j = val.size() - 1; i < j; i++, j--){
               if(val.get(i) != val.get(j)){
                   return false;
               }
           }
                             //节点偶数个，肯定不是
           if(i == j){
               return true;
           }
           else
           {
               return false;
           }

       }else{
           return false;
       }
    }

    public static void main(String[] args) {

    }
}*/
