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

    @Test
    public void countPathTest3() {
        int[][] grid = {

                {12469,18741,68716,30594,65029,44019,92944,84784,92781,5655,43120,81333,54113,88220,23446,6129,2904,48677,20506,79604,82841,3938,46511,60870,10825,31759,78612,19776,43160,86915,74498,38366,28228,23687,40729,42613,61154,22726,51028,45603,53586,44657,97573,61067,27187,4619,6135,24668,69634,24564,30255,51939,67573,87012,4106,76312,28737,7704,35798}
        };
        int output = 148;
        Assert.assertEquals(output, new Solution().countPaths(grid));
    }
}
