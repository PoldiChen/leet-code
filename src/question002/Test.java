package question002;

public class Test {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		ListNode listNode1 = createListNodeFromArray(new int[]{9});
		ListNode listNode2 = createListNodeFromArray(new int[]{1,9,9});
//		printListNode(listNode);
		
//		int i = 999999991;
		
		ListNode result = solution.addTwoNumbers(listNode1, listNode2);
		
		printListNode(result);
	}
	
	private static ListNode createListNodeFromArray(int[] nums) {
		ListNode firstNode = null;
		ListNode lastNode = firstNode;
		for (int i=0; i<nums.length; i++) {
			ListNode node = new ListNode(nums[i]);
			
			if (firstNode == null) {
				firstNode = node;
				lastNode = node;
			} else {
				lastNode.next = node;
				lastNode = node;
			}
			
			
		}
		return firstNode;
	}
	
	private static void printListNode(ListNode listNode) {
		System.out.println("-----");
		System.out.println(listNode);
		System.out.println(listNode.next);
		while (true) {
			if (listNode == null) {
				break;
			}
    		System.out.println(listNode.val);
    		listNode = listNode.next;
    	}
	}

}
