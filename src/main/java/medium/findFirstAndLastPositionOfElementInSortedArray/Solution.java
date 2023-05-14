package medium.findFirstAndLastPositionOfElementInSortedArray;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int leftBound = leftBinarySearch(0, nums.length - 1, nums, target);
        if (nums.length == 0 || nums[leftBound] != target) {
            return new int[]{-1, -1};
        }
        int rightBound = leftBound;
        if (leftBound + 1 < nums.length && nums[leftBound + 1] == target) {
            rightBound = rightBinarySearch(0, nums.length - 1, nums, target);
        }
        return new int[]{leftBound, rightBound};
    }

    private int leftBinarySearch(int l, int r, int[] nums, int target) {
        while (l < r) {
            int m = (l + r) / 2;
            if (isLessOrEqual(target, nums[m])) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private int rightBinarySearch(int l, int r, int[] nums, int target) {
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (isGreaterOrEqual(target, nums[m])) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    private boolean isLessOrEqual(int a, int b) {
        return a <= b;
    }

    private boolean isGreaterOrEqual(int a, int b) {
        return a >= b;
    }
}