package hard.medianOfTwoSortedArrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = leftBinSearch(0, nums1.length, nums1, nums2);
        int length = nums1.length + nums2.length;
        int n = (length) / 2 - m;

        return findMedian(m, nums1, nums2, n);
    }

    private int leftBinSearch(int l, int r, int[] shortNums, int[] longNums) {
        int length = shortNums.length + longNums.length;
        while (l < r) {
            int m = (r + l) / 2;
            int n = length / 2 - m;
            if (check(m, shortNums, longNums, n)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private double findMedian(int m, int[] shortNums, int[] longNums, int n) {
        int shorterLeft = m == 0 ? Integer.MIN_VALUE : shortNums[m - 1];
        int shorterRight = m == shortNums.length ? Integer.MAX_VALUE : shortNums[m];

        int longerLeft = n == 0 ? Integer.MIN_VALUE : longNums[n - 1];
        int longerRight = n == longNums.length ? Integer.MAX_VALUE : longNums[n];

        boolean isEven = (shortNums.length + longNums.length) % 2 == 0;
        if (isEven) {
            return (Math.max(shorterLeft, longerLeft)
                    + Math.min(shorterRight, longerRight))
                    / 2d;
        } else {
            return Math.min(shorterRight, longerRight);
        }
    }

    private boolean check(int m, int[] shortNums, int[] longNums, int n) {
        return !(shortNums[m] < longNums[n - 1]);
    }
}
