package question438;

import java.util.Arrays;
import java.util.List;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/6/20 13:29
 **/
public class Test {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = new Solution().findAnagrams(s, p);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
