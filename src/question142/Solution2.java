package question142;

/**
 * @author poldi.chen
 * @className Solution2
 * @description TODO
 * @date 2019/6/27 13:50
 **/
public class Solution2 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        ListNode meet = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                meet = fast;
                break;
            }
        }

        System.out.println(meet.val);

        if (meet == null) {
            return null;
        } else {
            ListNode dummyHead = new ListNode(-1);
            dummyHead.next = head;
            fast = dummyHead;
            slow = meet.next;
            while (fast != null && fast.next != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == slow) {
                    return fast;
                }
            }
            return null;
        }
    }
}
