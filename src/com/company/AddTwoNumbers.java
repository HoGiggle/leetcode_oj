/*
package com.company;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
*/
/**
 * Created by jjhu on 2015/1/5.
 *//*

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode root = l1;
        ListNode first = l1;
        int carry = 0;
        while (l1 != null || l2 != null){
            int sum = 0;
            if (l1 != null)
                sum += l1.val;
            if (l2 != null)
                sum += l2.val;

            sum += carry;

            if (l1 == null){
                l1 = new ListNode(0);
                first.next = l1;
            }
            if (sum >= 10){
                l1.val = sum - 10;
                carry = 1;
            }else {
                l1.val = sum;
                carry = 0;
            }
            first = l1;
            l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1){
            l1 = new ListNode(1);
            first.next = l1;
        }
        return root;
    }
}
*/
