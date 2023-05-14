package medium.sortAnArray;

import java.util.Arrays;

public class Solution {

    public int[] sortArray(int[] nums) {
        countingSort(nums);
        return nums;
    }

    //    O(N + K), N = 5 * 10^4, K = 10^5
    private void countingSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int k = max - min + 1;
        int[] numForCount = new int[k];
        for (int num : nums) {
            numForCount[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < numForCount.length; i++) {
            while (numForCount[i] > 0) {
                nums[index] = i + min;
                numForCount[i]--;
                index++;
            }
        }
    }
}