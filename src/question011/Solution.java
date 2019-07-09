package question011;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/9 13:50
 **/
class Solution {

    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int maxSize = Math.abs(head - tail) * Math.min(height[head], height[tail]);
        while (head < tail) {
            if (height[head] < height[tail]) {
                head = head + 1;
            } else {
                tail = tail - 1;
            }
            int currentSize = Math.abs(head - tail) * Math.min(height[head], height[tail]);
            maxSize = Math.max(maxSize, currentSize);
        }
        return maxSize;
    }
}
