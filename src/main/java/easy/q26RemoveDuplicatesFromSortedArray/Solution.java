package easy.q26RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                unique++;
                nums[unique] = nums[i];
            }
        }
        return unique;
    }
}
