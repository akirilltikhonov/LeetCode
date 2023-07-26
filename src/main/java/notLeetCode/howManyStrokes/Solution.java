package notLeetCode.howManyStrokes;

class Solution {
    public int solution(int[] A) {
        int count = 0;
        int previousHeight = 0;
        for(int height : A) {
            if(height > previousHeight) {
                count = count + (height - previousHeight);
            }
            previousHeight = height;
        }
        return count;
    }
}
