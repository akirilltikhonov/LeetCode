package easy.intersectionfTwoArrays;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> forIntersections = new HashSet<>();
        for (int i : nums1) {
            forIntersections.add(i);
        }
        Set<Integer> intersections = new HashSet<>();
        for (int i : nums2) {
            if (forIntersections.contains(i)) {
                intersections.add(i);
            }
        }
        return intersections.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
