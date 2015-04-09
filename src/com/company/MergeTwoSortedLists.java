//package com.company;
///**
// * Created by jjhu on 2015/4/1.
// */
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//
//public class MergeTwoSortedLists {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode p1 = l1;
//        ListNode p2 = l2;
//        ListNode head = new ListNode(0);
//        ListNode p = head;
//        while (p1 != null && p2 != null){
//            if (p1.val <= p2.val){
//                p.next = p1;
//                p = p.next;
//                p1 = p1.next;
//            }else {
//                p.next = p2;
//                p = p.next;
//                p2 = p2.next;
//            }
//        }
//
//        if (p1 == null){
//            p.next = p2;
//        }
//
//        if (p2 == null){
//            p.next = p1;
//        }
//        return head.next;
//    }
//}
