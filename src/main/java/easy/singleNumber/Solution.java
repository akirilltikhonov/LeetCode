package easy.singleNumber;

public class Solution {

//    public int easy.singleNumber(int[] nums) {
//        int factSum = Arrays.stream(nums).sum();
//        int doubleUniqSum = 2 * Arrays.stream(nums)
//                .distinct()
//                .reduce(0, Integer::sum);
//        return doubleUniqSum - factSum;
//    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
