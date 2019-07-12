package question015;

import java.util.*;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/12 14:22
 **/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i]; // 选定一个数
            int head = i+1; // 选定的数后面的第一个数
            int tail = nums.length - 1; // 选定的数后面的最后一个数
            while (head < tail) {
                int tempTotal = first + nums[head] + nums[tail];
                if (tempTotal == 0) {
                    String resultStr = first + "-" + nums[head] + "-" + nums[tail];
                    if (!resultSet.contains(resultStr)) {
                        List<Integer> oneResult = new ArrayList<>();
                        oneResult.add(first);
                        oneResult.add(nums[head]);
                        oneResult.add(nums[tail]);
                        result.add(oneResult);
                        resultSet.add(resultStr);
                    }
                    head ++;
                    tail --;
                } else if (tempTotal > 0) {
                    tail --;
                } else {
                    head ++;
                }
            }
        }
        return result;
    }
}
