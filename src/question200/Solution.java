package question200;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2020/5/17 10:52
 **/
class Solution {

    // DFS深度优先搜索，搜索过的点置为0

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int result = 0;

        int nr = grid.length;
        int nc = grid[0].length;

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    result ++;
                    dfs(grid, r, c);
                }
            }
        }

        return result;
    }

    private void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >=nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
    }
}
