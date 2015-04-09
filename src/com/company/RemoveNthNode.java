package com.company;

/**
 * Created by jjhu on 2015/4/2.
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
  }
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*int length = 0;
        ListNode p = head;
        while (p != null){
            length++;
            p = p.next;
        }
        if (length == n) return head.next;
        p = head;
        while (n < length - 1){
            p = p.next;
            n++;
        }
        p.next = p.next.next;
        return head;*/

        int length = 0;
        ListNode p = head;
        while (p != null){
            length++;
            p = p.next;
        }
        if (length == n) return head.next;
        ListNode ahead = new ListNode(0);
        ahead.next = head;
        p = ahead;
        while (n < length){
            p = p.next;
            n++;
        }
        p.next = p.next.next;
        return ahead.next;
    }
}
