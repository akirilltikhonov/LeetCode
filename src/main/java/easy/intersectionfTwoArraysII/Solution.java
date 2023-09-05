package easy.intersectionfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> forIntersections = new HashMap<>();
        for (int i : nums1) {
            forIntersections.put(i, forIntersections.getOrDefault(i, 0) + 1);
        }
        List<Integer> intersectionsWithRepeats = new ArrayList<>();
        for (int i : nums2) {
            Integer times = forIntersections.get(i);
            if (times != null && times > 0) {
                intersectionsWithRepeats.add(i);
                forIntersections.put(i, times - 1);
            }
        }
        return intersectionsWithRepeats.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
