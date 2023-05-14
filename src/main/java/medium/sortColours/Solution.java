package medium.sortColours;

import java.util.Arrays;

public class Solution {

//    public void sortColors(int[] nums) {
//        int max = 2;
//        int min = 0;
//        int k = max - min + 1;
//        int[] count = new int[k];
//        for (int num : nums) {
//            count[num - min] += 1;
//        }
//        int c = 0;
//        for (int i = 0; i < count.length; i++) {
//            for (int j = 0; j < count[i]; j++) {
//                nums[c] = i;
//                c++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int point = 0;

        while (point <= high) {
            if (nums[point] == 0) {
                swap(nums, point, low);
                low++;
                point++;
            } else if (nums[point] == 2) {
                swap(nums, point, high);
                high--;
            } else {
                point++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
