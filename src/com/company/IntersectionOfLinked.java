/*
package com.company;

*/
/**
 * Created by jjhu on 2014/12/2.
 *//*



//Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfLinked {

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = length(headA), lenB = length(headB);
            // move headA and headB to the same start point
            while (lenA > lenB) {
                headA = headA.next;
                lenA--;
            }
            while (lenA < lenB) {
                headB = headB.next;
                lenB--;
            }
            // find the intersection until end
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }

        private int length(ListNode node) {
            int length = 0;
            while (node != null) {
                node = node.next;
                length++;
            }
            return length;
        }
    }
}
*/
