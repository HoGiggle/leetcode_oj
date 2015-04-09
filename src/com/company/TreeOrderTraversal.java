/*
package com.company;

import java.util.*;

*/
/**
 * tips:用两个队列来完成层次输出，basicQueue存储每层的节点，入队操作，不做出队操作，用来回档queue队列；
 *      queue队列进行出队操作，不入队，用来遍历每层节点
 * Created by jjhu on 2014/12/1.
 *//*


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class TreeOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        if(root != null){
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            Queue<TreeNode> basicQueue = new LinkedList<TreeNode>();
            TreeNode node;
            queue.offer(root);
            basicQueue.offer(root);
            while (!queue.isEmpty()){
                List<Integer> list = new ArrayList<Integer>();
                while (!queue.isEmpty()){
                    node = queue.poll();
                    list.add(node.val);
                }
                allList.add(list);
                for(Iterator<TreeNode> iterator = basicQueue.iterator(); iterator.hasNext(); ){
                    queue.offer(iterator.next());
                }

                basicQueue.clear();

                while (!queue.isEmpty()){
                    node = queue.poll();
                    if(node.left != null){
                        basicQueue.offer(node.left);
                    }
                    if(node.right != null){
                        basicQueue.offer(node.right);
                    }
                }
                for(Iterator<TreeNode> iterator = basicQueue.iterator(); iterator.hasNext(); ){
                    queue.offer(iterator.next());
                }
            }
            return allList;
        }else {
            return allList;
        }
    }
}
*/
