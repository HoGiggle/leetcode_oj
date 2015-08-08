package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MrHu on 2015/8/2.
 */
public class KthSmallestElementinaBST {
    public void midSearch(TreeNode root, List<Integer> res, int k){
        if (root == null) return;
        if (res.size() >= k) return;
        midSearch(root.left, res, k);
        res.add(root.val);
        midSearch(root.right, res, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<Integer>();
        midSearch(root, res, k);
        return res.get(k - 1);
    }
}
