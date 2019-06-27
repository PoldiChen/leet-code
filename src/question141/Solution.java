package question141;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/27 12:52
 **/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println(slow.val);
                return true;
            }
        }
        return false;
    }
}



