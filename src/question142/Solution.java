package question142;

import java.util.HashSet;
import java.util.Set;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/27 13:14
 **/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet();
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode current = dummyHead;
        while (current.next != null) {
            if (set.contains(current.next)) {
                return current.next;
            } else {
                current = current.next;
                set.add(current);
            }
        }
        return null;
    }
}
