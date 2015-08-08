package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MrHu on 2015/7/27.
 */
public class PathSumII   {
    public void isSum2(List<List<Integer>> res, int []stack, int top, TreeNode root, int sum){
        if (root == null) return;
        if (root.left == null && root.right == null){
            if (root.val == sum){
                List<Integer> news = new ArrayList<Integer>();
                for (int i = 0; i <= top; i++){
                    news.add(stack[i]);
                }
                news.add(root.val);
                res.add(news);
            }
            return;
        }
        stack[++top] = root.val;
        isSum2(res, stack, top, root.left, sum - root.val);
        isSum2(res, stack, top, root.right, sum - root.val);
        top--;
    }

    public void isSum(List<List<Integer>> res, List<Integer> once, TreeNode root, int sum){
        if (root == null) return;
        if (root.left == null && root.right == null){
            if (root.val == sum){
                List<Integer> news = new ArrayList<Integer>(once);
                news.add(root.val);
                res.add(news);
            }
            return;
        }
        once.add(root.val);
        isSum(res, once, root.left, sum - root.val);
        isSum(res, once, root.right, sum - root.val);
        once.remove(once.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        int []stack = new int[100];
//        int top = -1;
        List<Integer> once = new ArrayList<Integer>();
        isSum(res, once, root, sum);

//        isSum2(res, stack, top, root, sum);
        return res;
    }
}
