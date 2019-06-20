package question829;

/**
 * @author poldi.chen
 * @className Solution2
 * @description TODO
 * @date 2019/6/20 12:36
 **/
class Solution2 {
    public int consecutiveNumbersSum(int N) {
        int middle = (N+1)/2;
        int left = 1;
        int right = 2;
        int sum = left + right;
        int count = 1;
        while (left <= middle) {
            if (sum == N) {
                count ++;
                sum += ++right;
                sum -= left++;
            } else if (sum < N) {
                sum += ++right;
            } else {
                sum -= left++;
            }
        }
        return count;
    }
}