package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MrHu on 2015/7/29.
 */
public class BinaryTreeLevelOrderTraversalII {
    public int treeHeight(TreeNode root){
        if (root == null) return 0;
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        return Math.max(left, right) + 1;
    }
    public void onceLevel(TreeNode root, Map<Integer,List<Integer>> map, int level){
        if (root == null) return;
        if (map.containsKey(level)){
            map.get(level).add(root.val);
        }else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            map.put(level, list);
        }
       onceLevel(root.left, map, level + 1);
       onceLevel(root.right, map, level + 1);
    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        onceLevel(root, map, 0);
        int high = treeHeight(root);
        for (int level = high - 1; level >= 0; level--){
            res.add(map.get(level));
        }
        return res;
    }
}
