// Last updated: 7/14/2026, 1:53:11 PM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        for (int i = 0; i < k / 2; i++) {

            int top = x + i;
            int bottom = x + k - 1 - i;

            for (int j = y; j < y + k; j++) {

                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }
        }

        return grid;
    }
}