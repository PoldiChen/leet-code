package question829;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/20 13:08
 **/
class Solution {
    public int consecutiveNumbersSum(int N) {
        int count = 0;
        int k = 1;
        while (k*(k+1) <= 2*N) {
            if ((N - k*(k+1)/2) % k == 0) {
                count ++;
            }
            k++;
        }
        return count;
    }
}
