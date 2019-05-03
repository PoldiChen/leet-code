package question007;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/4/27 16:01
 **/
class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10; // 取出最后一位数字
            x = x / 10; // 原数字减少最后一位
            if (result > (Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE && pop > 7)) {
//                System.out.println("result1:" + result);
                return 0;
            }
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE && pop < -8)) {
//                System.out.println("result2:" + result);
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
