package medium.q209MinimumSizeSubarraySum;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int min = 0;
        int subSum = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            subSum += nums[r];
            if (subSum >= target) {
                min = findMin(min, l, r);
                while (subSum >= target) {
                    min = findMin(min, l, r);
                    subSum -= nums[l];
                    l++;
                }
            }
        }
        return min;
    }

    private int findMin(int min, int l, int r) {
        return Math.min(min == 0 ? Integer.MAX_VALUE : min, r - l + 1);
    }
}