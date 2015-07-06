package intel.bigdata.com;

/**
 * Created by root on 6/3/15.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }


public class RemoveList {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode p = new ListNode(0);
        p.next = head;
        ListNode fir = p;
        while (head != null){
            if (head.val == val){
                head = head.next;
                fir.next = head;
            }else {
                head = head.next;
                fir = fir.next;
            }
        }
        return p.next;

    }
}
