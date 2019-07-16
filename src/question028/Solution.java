package question028;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/16 14:02
 **/
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.equals("")) {
            return -1;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int result = -1;
        int index = 0;
        while (true) {
            if (haystack.substring(index, index + needle.length()).equals(needle)) {
                result = index;
                break;
            }
            index ++;
            if (index > (haystack.length()- needle.length())) {
                break;
            }
        }
        return result;
    }
}
