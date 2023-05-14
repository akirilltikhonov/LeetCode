package easy.twoSum;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static String twoSum(int n, int[] count, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int dif = k - count[i];
            if (set.contains(dif)) {
                return count[i] + " " + dif;
            } else {
                set.add(count[i]);
            }
        }
        return "None";
    }
}
