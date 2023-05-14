package medium.searchA2DMatrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[] resY = findY(0, matrix.length - 1, matrix, target);
        if (resY[0] == 0) {
            int y = resY[1];
            return isContained(0, matrix[y].length - 1, matrix[y], target);
        } else {
            return resY[0] == 1;
        }
    }

    private int[] findY(int l, int r, int[][] matrix, int target) {
        int[] res = {0, 0};
        int length = matrix[0].length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (target <= matrix[m][length]) {
                r = m;
//                reduce amount of cycles
                if (target == matrix[r][length]) {
                    res[0] = 1;
                    l = r;
                }
            } else {
                l = m + 1;
            }
        }
//        for cases than only else was used
        if (target == matrix[l][length]) {
            res[0] = 1;
        }
        res[1] = l;
        return res;
    }

    private boolean isContained(int l, int r, int[] matrixY, int target) {
        while (l < r) {
            int m = (l + r) / 2;
            if (target <= matrixY[m]) {
                r = m;
//                to reduce amount of cycles
                if (target == matrixY[r]) {
                    l = r;
                }
            } else {
                l = m + 1;
            }
        }
        return target == matrixY[l];
    }
}