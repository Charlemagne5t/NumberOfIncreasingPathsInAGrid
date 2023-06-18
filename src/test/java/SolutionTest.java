import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countPathTest1() {
        int[][] grid = {
                {1, 1},
                {3, 4}
        };
        int output = 8;
        Assert.assertEquals(output, new Solution().countPaths(grid));
    }

    @Test
    public void countPathTest2() {
        int[][] grid = {
                {1},
                {2}
        };
        int output = 3;
        Assert.assertEquals(output, new Solution().countPaths(grid));
    }


}
