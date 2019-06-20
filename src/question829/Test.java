package question829;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/6/20 12:39
 **/
public class Test {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 15;
        System.out.println(new Solution().consecutiveNumbersSum(n));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
