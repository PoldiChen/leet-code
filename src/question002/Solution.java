package question002;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode firstNode = null;
    	ListNode lastNode = firstNode;
    	boolean jinwei = false;
    	while (true) {
    		if (l1 == null && l2 == null) {
    			if (jinwei) {
    				ListNode node = new ListNode(1);
    				lastNode.next = node;
    			}
    			break;
    		}
    		
    		int val1 = l1 == null? 0: l1.val;
    		int val2 = l2 == null? 0: l2.val;
    		int total = val1 + val2;
    		if (jinwei) {
    			total += 1;
    		}
    		
    		if (total > 9) {
    			jinwei = true;
    		} else {
    			jinwei = false;
    		}
    		ListNode node = new ListNode(total%10);
    		if (firstNode == null) {
    			firstNode = node;
    			lastNode = node;
    		} else {
    			lastNode.next = node;
        		lastNode = node;
    		}
    		
    		
    		l1 = l1 == null? null: l1.next;
    		l2 = l2 == null? null: l2.next;

    	}
    	
    	return firstNode;
    }
    

    

}
