package medium.q80RemoveDuplicatesFromSortedArrayII;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        int amount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[counter] = nums[i];
                counter++;
                amount = 1;
            } else if (amount < 2) {
                nums[counter] = nums[i];
                counter++;
                amount++;
            }
        }
        return counter;
    }
}