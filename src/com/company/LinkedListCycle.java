package com.company;

/**
 * Created by MrHu on 2015/8/18.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode first = head, sec = head;
        while (sec.next != null && sec.next.next != null ){
            first = first.next;
            sec = sec.next.next;
            if (first == sec) return true;
        }
        return false;
    }
}
