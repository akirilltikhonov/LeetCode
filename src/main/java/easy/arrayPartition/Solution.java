package easy.arrayPartition;

import java.util.Arrays;

public class Solution {

    public int arrayPairSum(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int k = max - min + 1;
        int[] numToCount = countingSort(nums, min, k);

        int maxOfMinPairSum = 0;
        boolean isEvenIndex = false;
        for (int i = 0; i < numToCount.length; i++) {
            int times = numToCount[i];
            int num = i + min;
            int add = !isEvenIndex ? 1 : 0;
            maxOfMinPairSum += num * ((times + add) / 2);
            isEvenIndex = (times % 2 == 0) == isEvenIndex;
        }
        return maxOfMinPairSum;
    }

    private int[] countingSort(int[] nums, int min, int k) {
        int[] forCount = new int[k];
        for (int num : nums) {
            forCount[num - min] += 1;
        }
        return forCount;
    }
}