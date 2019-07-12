package question027;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/12 15:45
 **/
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
