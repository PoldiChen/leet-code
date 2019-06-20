package question438;

import java.util.*;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/20 13:26
 **/
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = p.length()-1;
        while (right < s.length()) {
            if (isYiwei(s.substring(left, right+1), p)) {
                result.add(left);
            }
            left++;
            right++;
        }
        return result;
    }

    public boolean isYiwei(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        return Arrays.equals(charsA, charsB);
    }
}
