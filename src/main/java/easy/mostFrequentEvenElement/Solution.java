package easy.mostFrequentEvenElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> evensMap = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                evensMap.put(num, evensMap.getOrDefault(num, 0) + 1);
            }
        }

        int minAndMostFrequentEven = -1;
        int maxFrequency = 0;
        for (Integer even : evensMap.keySet()) {
            Integer frequency = evensMap.get(even);
            if (frequency > maxFrequency || (frequency == maxFrequency && even < minAndMostFrequentEven)) {
                maxFrequency = frequency;
                minAndMostFrequentEven = even;
            }
        }
        return minAndMostFrequentEven;
    }
}
