package easy.leftAndRightSumDifferences;

public class Solution {

    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        leftSum[0] = 0;
        int[] rightSum = new int[n];
        rightSum[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
            int j = n - 1 - i;
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}