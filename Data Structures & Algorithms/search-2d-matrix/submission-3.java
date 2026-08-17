class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int l=0;
        int r=rows*cols-1;

        while(l<=r) {
            int m = l + (r-l)/2;
            if(matrix[m/cols][m%cols] > target) {
                r=m-1;
            } else if (matrix[m/cols][m%cols] < target) {
                l=m+1;
            }else {
                return true;
            }
        }
        return false;
    }
}
