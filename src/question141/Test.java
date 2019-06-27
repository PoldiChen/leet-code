package question141;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/6/27 12:56
 **/
public class Test {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(new Solution().hasCycle(node1));
    }


    private static ListNode createList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode head1 = head;
        for (int i = 1; i < values.length; i++) {
            ListNode node = new ListNode(values[i]);
            head.next = node;
            head = node;
        }
        return head1;
    }
}
