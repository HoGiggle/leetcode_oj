package intel.bigdata.com;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by root on 6/9/15.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode p = head;
        while (p != null){
            if (set.contains(p.val)){
                first.next = p.next;
                p = p.next;
            }else {
                set.add(p.val);
                first = first.next;
                p = p.next;
            }
        }
        return head;
    }
}
