public class Solution {
    public int countPaths(int[][] grid) {
        int modulo = 1_000_000_000 + 7;
        int m = grid.length;
        int n = grid[0].length;
        Integer[][] memo = new Integer[m][n];
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer = (answer + dfs(grid, i, j, memo) % modulo) % modulo;
            }
        }

        return answer;
    }

    private int dfs(int[][] grid, int i, int j, Integer[][] memo) {
        int modulo = 1_000_000_000 + 7;
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        int result = 0;
        //NORTH
        if (i > 0 && grid[i][j] < grid[i - 1][j]) {
            result = (result + dfs(grid, i - 1, j, memo)) % modulo;
        }
        //EAST
        if (j < grid[i].length - 1 && grid[i][j] < grid[i][j + 1]) {
            result = (result + dfs(grid, i, j + 1, memo)) % modulo;
        }
        //SOUTH
        if (i < grid.length - 1 && grid[i][j] < grid[i + 1][j]) {
            result = (result + dfs(grid, i + 1, j, memo)) % modulo;
        }
        //WEST
        if (j > 0 && grid[i][j] < grid[i][j - 1]) {
            result = (result + dfs(grid, i, j - 1, memo)) % modulo;
        }
        memo[i][j] = result + 1;
        return result + 1;
    }
}
/*# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to find all paths from each cell and then sum them all up.
# Approach
<!-- Describe your approach to solving the problem. -->
DFS for finding paths. We should use memoization to reduce complexity.

# Complexity
- Time complexity:
- O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
- O(n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->*/