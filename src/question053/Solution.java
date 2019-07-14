package question053;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/14 10:54
 **/
class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (num + sum > num) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(sum, result);
        }
        return result;
    }
}
