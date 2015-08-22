package com.company;

import java.util.*;

/**
 * Created by MrHu on 2015/8/18.
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode first = head, sec = head;
        while (sec.next != null && sec.next.next != null ){
            first = first.next;
            sec = sec.next.next;
            if (first == sec) return first;
        }
        return null;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        System.out.println((-3)<<1);
    }
}
