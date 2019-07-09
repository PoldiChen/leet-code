package question014;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/9 13:58
 **/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = 0;
        String result = "";
        while (true) {
            if (index >= strs[0].length()) {
                return result;
            }
            String ch = strs[0].substring(index, index+1);
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length()) {
                    return result;
                }
                if (!strs[i].substring(index, index+1).equals(ch)) {
                    return result;
                }
            }
            result += ch;
            index ++;
        }
    }
}