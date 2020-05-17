package question200;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2020/5/17 11:12
 **/
public class Test {

    public static void main(String[] args) {
        char[][] grid = new char[4][5];

        char[] line1 = new char[]{'1', '1', '0', '0', '0', '0'};
        char[] line2 = new char[]{'1', '1', '0', '0', '0', '0'};
        char[] line3 = new char[]{'0', '0', '1', '0', '0', '0'};
        char[] line4 = new char[]{'0', '0', '0', '0', '1', '1'};

        grid[0] = line1;
        grid[1] = line2;
        grid[2] = line3;
        grid[3] = line4;

        int result = new Solution().numIslands(grid);
        System.out.println(result);
    }
}
