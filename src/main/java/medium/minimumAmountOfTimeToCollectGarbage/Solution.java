package medium.minimumAmountOfTimeToCollectGarbage;

public class Solution {

    public int garbageCollection(String[] garbage, int[] travel) {
        int[] minutesAndLastG = countMinutesAndLastG(garbage);
        leftSum(travel);
        countStops(travel, minutesAndLastG);
        return minutesAndLastG[0];
    }

    private int[] countMinutesAndLastG(String[] garbage) {
        int[] minutesAndLastG = new int[4];
        for (int i = 0; i < garbage.length; i++) {
            for (char g : garbage[i].toCharArray()) {
                minutesAndLastG[0]++;
                if (g == 'M') {
                    minutesAndLastG[1] = i;
                } else if (g == 'P') {
                    minutesAndLastG[2] = i;
                } else {
                    minutesAndLastG[3] = i;
                }
            }
        }
        return minutesAndLastG;
    }

    private void leftSum(int[] travel) {
        for (int i = 1; i < travel.length; i++) {
            travel[i] += travel[i - 1];
        }
    }

    private void countStops(int[] travel, int[] minutesAndLastG) {
        if (minutesAndLastG[1] > 0) {
            minutesAndLastG[0] += travel[minutesAndLastG[1] - 1];
        }
        if (minutesAndLastG[2] > 0) {
            minutesAndLastG[0] += travel[minutesAndLastG[2] - 1];
        }
        if (minutesAndLastG[3] > 0) {
            minutesAndLastG[0] += travel[minutesAndLastG[3] - 1];
        }
    }
}