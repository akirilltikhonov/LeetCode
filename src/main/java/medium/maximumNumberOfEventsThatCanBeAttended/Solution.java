package medium.maximumNumberOfEventsThatCanBeAttended;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        int day = 1;
        int dayCount = 0;
        int maxDay = findMaxDay(events);
        int eventCount = 0;
        PriorityQueue<int[]> eventsAsc = createEventsAscPriorityQueue();
        while (day <= maxDay) {
            while (dayCount < events.length && day == events[dayCount][0]) {
                eventsAsc.add(events[dayCount]);
                dayCount++;
            }
            if (!eventsAsc.isEmpty()) {
                eventsAsc.remove();
                eventCount++;
            }
            while (!eventsAsc.isEmpty() && eventsAsc.peek()[1] <= day) {
                eventsAsc.remove();
            }
            day++;
        }
        return eventCount;
    }

    private int findMaxDay(int[][] events) {
        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }
        return maxDay;
    }

    private PriorityQueue<int[]> createEventsAscPriorityQueue() {
        return new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
    }
}