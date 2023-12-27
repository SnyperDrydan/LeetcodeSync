class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] oneRows = new int[grid.length];
        int[] zeroRows = new int[grid.length];
        int[] oneCols = new int[grid[0].length];
        int[] zeroCols = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) {
                    zeroRows[i]++;
                    zeroCols[j]++;
                } else {
                    oneRows[i]++;
                    oneCols[j]++;
                }
            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                grid[i][j] = oneRows[i] + oneCols[j] - zeroRows[i] - zeroCols[j];
            }
        }

        return grid;
    }
}