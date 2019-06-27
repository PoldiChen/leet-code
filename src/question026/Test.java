package question026;

import java.util.Arrays;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/6/27 14:32
 **/
public class Test {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,3,3,3,3,3,3,5};
        System.out.println(new Solution().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
