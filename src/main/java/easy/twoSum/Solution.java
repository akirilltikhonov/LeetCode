package easy.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[]{map.get(dif), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
