package easy.sqrtX;

public class Solution {

    public int mySqrt(int x) {
        int ans = 0;
        int low = 1;
        int high = x;
        while (low <= high) {
            int medium = low + (high - low) / 2;
            if (x / medium == medium) {
                return medium;
            } else if (x / medium < medium) {
                high = medium - 1;
            } else if (x / medium > medium) {
                low = medium + 1;
                ans = medium;
            }
        }
        return ans;
    }
}
