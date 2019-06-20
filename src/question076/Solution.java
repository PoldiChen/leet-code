package question076;

import java.util.Arrays;
import java.util.List;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/20 15:13
 **/
class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        int left = 0;
        int right = t.length() - 1;
        while (right < s.length()) {
            String temp = s.substring(left, right);
            if (isCovered(temp, t)) {
                if (result.length() == 0) {
                    result = temp;
                } else if (temp.length() < result.length()) {
                    result = temp;
                }
            } else {
                // TODO
            }
        }
        return null;
    }

    private boolean isCovered(String s, String t) {
        return true;
    }
}
