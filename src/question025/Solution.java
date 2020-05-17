package question025;

/**
 * @author poldi.chen
 * @className Solution
 * @description https://mp.weixin.qq.com/s/eYmjN7koPfgYTc8L5oIAhQ
 * @date 2019/8/15 11:35
 **/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int i = 1;
        while (i <= k) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            i++;
        }

        if (temp.next == null) {
            return head;
        }



        return temp;
    }

    // 单向链表逆序
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode node = new Solution().reverseKGroup(node1, 2);

        System.out.println(node.val);
        
//        printList(node);
    }
}
