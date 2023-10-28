class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int h = matrix[0].length * matrix.length - 1;

        while(l <= h) {
            int m = (l+h)/2;
            int x = m/matrix[0].length;
            int y = m%matrix[0].length;

            if(matrix[x][y] == target) {
                return true;
            } else if(matrix[x][y] < target) {
                l = m+1;
            } else {
                h = m-1;
            }
        }
        
        return false;
    }
}