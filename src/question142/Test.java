package question142;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/6/27 13:33
 **/
public class Test {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(0);
//        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node1;

//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node2;

        System.out.println(new Solution2().detectCycle(node1).val);
    }
}
