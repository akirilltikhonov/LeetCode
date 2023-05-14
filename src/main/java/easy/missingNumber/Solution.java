package easy.missingNumber;

public class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int factSum = 0;
        for (int num : nums) {
            factSum += num;
        }
        return expectedSum - factSum;
    }
}
