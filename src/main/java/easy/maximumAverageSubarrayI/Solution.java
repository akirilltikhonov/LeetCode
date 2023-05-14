package easy.maximumAverageSubarrayI;

public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0d;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double result = sum;
        for(int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (result < sum) {
                result = sum;
            }
        }
        return result / k;
    }
}
