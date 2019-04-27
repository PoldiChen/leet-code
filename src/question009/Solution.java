package question009;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 17:55
 **/
class Solution {
    public boolean isPalindrome(int x) { // 1221
        if (x < 0 || (x % 10 == 0 && x != 0)) { // 负数，或者最后一位是0
            return false;
        }
        if (x < 10) {
            return true;
        }
        int total = 0;
        while (true) {
            int num = x % 10; // 最后一位数字
            x = x / 10; // 取出最后一位后剩余的数字
            total = total * 10 + num; // 取出的数字组成的整数
            if (total > x) { // 已经处理了超过一半
                return false;
            }
            if (total == x || total == x / 10) { // 原整数的位数为奇数
                return true;
            }
        }
    }
}
