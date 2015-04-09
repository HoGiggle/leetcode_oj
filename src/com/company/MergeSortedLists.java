/*
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

*/
/**
 * Created by jjhu on 2015/1/15.
 *//*


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class MergeSortedLists {
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || lists.size() == 0)
            return null;
        List<Integer> valList = new ArrayList<Integer>();
        ListNode []nodeArray = new ListNode[lists.size()];
        int key = 0;
        for (ListNode node : lists){
            nodeArray[key++] = node;
            while (node != null) {
                valList.add(node.val);
                node = node.next;
            }
        }

        int size = valList.size();
        int []valArray = new int[size];
        for (int i = 0; i < size; i++){
            valArray[i] = valList.get(i);
        }
        Arrays.sort(valArray);
        int first = Integer.MAX_VALUE - 1;
        ListNode root = new ListNode(0);
        ListNode p = root;
        for (ListNode node : lists)
        for (int i = 0; i < size; i++){
            if (valArray[i] == first)
                continue;
            for (int j = 0; j < lists.size(); j++) {
                while (nodeArray[j] != null && nodeArray[j].val == valArray[i]) {
                    p.next = nodeArray[j];
                    p = p.next;
                    nodeArray[j] = nodeArray[j].next;
                }
            }
        }
        return root.next;
    }
}
*/
