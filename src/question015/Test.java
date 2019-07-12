package question015;

import java.util.Arrays;
import java.util.List;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/7/12 14:40
 **/
public class Test {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new Solution().threeSum(nums);
        for (List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
