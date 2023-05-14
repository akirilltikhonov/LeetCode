package medium.searchA2DMatrixII;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix[0].length - 1;
        int y = 0;
        while (x >= 0 && y < matrix.length) {
            int point = matrix[y][x];
            if (point > target) {
                x--;
            } else if (point < target){
                y++;
            } else {
                return true;
            }
        }
        return false;
    }
}