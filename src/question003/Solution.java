package question003;

import java.util.HashSet;
import java.util.Set;

class Solution {
	
    public int lengthOfLongestSubstring(String s) {
    	int result = 0;
    	int i = 0, j = 0;
    	Set<Character> set = new HashSet<>();
    	while (i < s.length() && j < s.length()) {
    		if (set.contains(s.charAt(j))) {
    			set.remove(s.charAt(i));
    			i++;
    		} else {
    			set.add(s.charAt(j));
    			j++;
    			result = Math.max(result, j-i);
    		}
    	}
    	return result;
    }
    
}
