package question016;

import java.util.Arrays;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/12 15:23
 **/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            int head = i + 1;
            int tail = nums.length - 1;
            while (head < tail) {
                int tempTotal = first + nums[head] + nums[tail];

                if (tempTotal == target) {
                    return tempTotal;
                } else {
                    int distanceTemp = Math.abs(target - tempTotal);
                    if (distanceTemp < distance) {
                        distance = distanceTemp;
                        result = tempTotal;
                    }
                    if (tempTotal > target) {
                        tail --;
                    }
                    if (tempTotal < target) {
                        head ++;
                    }
                }
            }
        }
        return result;
    }
}
