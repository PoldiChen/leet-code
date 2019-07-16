package question477;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/16 14:26
 **/
class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count1 = 0;
            for (int num : nums) {
                String binStr = toBinaryString(num);
                if (binStr.charAt(i) == '1') {
                    count1++;
                }
            }
            result += count1 * (nums.length - count1);
        }
        return result;
    }

    private String toBinaryString(int num) {
        String str = Integer.toBinaryString(num);
        while (str.length() < 32) {
            str = "0" + str;
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().totalHammingDistance(new int[]{6, 1, 8, 6, 8}));
//        System.out.println(new Solution().countDistance("100", "1110"));
    }
}
