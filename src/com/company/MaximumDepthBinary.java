/*
package com.company;

*/
/**
 * Created by jjhu on 2014/12/4.
 *//*


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class MaximumDepthBinary {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left>right ? left+1 : right+1;
    }
}
*/
