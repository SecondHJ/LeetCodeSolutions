package easy;

/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more
 * connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a
 * square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 *
 * Example:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 * Answer: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image below:
 *
 * 解决思路:
 * count 每个正方形的边，如有相邻count - 2 (减去双方边数)
 *
 * Created by second on 2017/9/24.
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1){
                    count += 4;
                    if (j != 0 && grid[i][j - 1] == 1) count -= 2;
                    if (i != 0 && grid[i - 1][j] == 1) count -= 2;
                }
            }
        }
        return count;
    }

}
