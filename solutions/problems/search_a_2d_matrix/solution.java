class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int l = 0, h = matrix.length * matrix[0].length - 1;

        while(l<=h) {
            int m = (l+h)/2;

            if(matrix[m/matrix[0].length][m%matrix[0].length] == target)
                return true;
            else if(matrix[m/matrix[0].length][m%matrix[0].length] < target)
                l = m+1;
            else
                h = m-1;
        }

        return false;
        
    }
}