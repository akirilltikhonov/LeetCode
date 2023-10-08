package medium.q57InsertInterval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        boolean isInserted = false;
        LinkedList<int[]> merged = new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] interval;
            if (!isInserted && Arrays.compare(intervals[i], newInterval) >= 0) {
                interval = newInterval;
                i--;
                isInserted = true;
            } else {
                interval = intervals[i];
            }
            merge(merged, false, interval);
        }
        merge(merged, isInserted, newInterval);
        return merged.toArray(new int[merged.size()][]);
    }

    private void merge(LinkedList<int[]> merged, boolean isInserted, int[] interval) {
        if (merged.isEmpty() || (!isInserted && merged.getLast()[1] < interval[0]) ) {
            merged.add(interval);
        } else {
            merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
        }
    }
}