package com.company;

import java.util.Random;

/**
 * Created by MrHu on 2015/8/6.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode end = head;
        int len = 1;
        while (end.next != null){
            len++;
            end = end.next;
        }

        k = k % len;
        ListNode p = head;
        for (int i = 0; i < len - k - 1; i++){
            p = p.next;
        }

        end.next = head;
        head = p.next;
        p.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        p1.next = p2;
        ListNode p3 = new ListNode(3);
        p2.next = p3;
        p3.next = null;
        RotateList r = new RotateList();
        System.out.println(r.rotateRight(p1, 20));
    }
}
