package medium.subarraySumsDivisibleByK;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int remainder = 0;
        for (int i = 0; i < nums.length; i++) {
            remainder = ((remainder + nums[i]) % k + k) % k;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        int ans = map.getOrDefault(0, 0);

        for (int frequency : map.values())
            ans += frequency * (frequency - 1) / 2;
        return ans;
    }

//    O(N^2)
//    public int subarraysDivByK(int[] nums, int k) {
//        int[] prefixSum = new int[nums.length];
//        prefixSum[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            prefixSum[i] += prefixSum[i - 1] + nums[i];
//        }
//
//        int ans = 0;
//        for (int i = 0; i < prefixSum.length; i++) {
//            if (prefixSum[i] % k == 0) {
//                ans++;
//                viewSubArray(i, i, nums);
//            }
//            for (int j = i + 1; j < prefixSum.length; j++) {
//                if ((prefixSum[i] - prefixSum[j]) % k == 0) {
//                    ans++;
//                    viewSubArray(i, j, nums);
//                }
//            }
//        }
//        return ans;
//    }
//
//    private void viewSubArray(int i, int j, int[] nums) {
//        StringBuilder arr = new StringBuilder();
//        for (int y = i; y <= j; y++) {
//            arr.append(nums[y]).append(" ");
//        }
//        if (!"".equals(arr.toString())) {
//            System.out.println(arr);
//        }
//    }
}
