package question026;

import java.util.Arrays;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/27 14:29
 **/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] == nums[slow]) {
                fast ++;
            } else {
                slow ++;
                nums[slow] = nums[fast];
                fast ++;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, slow+1);
        System.out.println(Arrays.toString(nums));
        return slow+1;
    }
}
