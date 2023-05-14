package easy.numberOfArithmeticTriplets;

public class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        for (int first = 0; first < nums.length; first++) {
            int last = first + 1;
            while (last < nums.length && nums[last] - nums[first] <= diff) {
                if (nums[last] - nums[first] == diff) {
                    int last2 = last + 1;
                    while (last2 < nums.length && nums[last2] - nums[last] <= diff) {
                        if (nums[last2] - nums[last] == diff) {
                            cnt++;
                        }
                        last2++;
                    }
                }
                last++;
            }

        }
        return cnt;
    }
}
