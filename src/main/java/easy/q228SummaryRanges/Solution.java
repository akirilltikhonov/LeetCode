package easy.q228SummaryRanges;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int begin = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if(begin == nums[i]) {
                ranges.add("" + nums[i]);
            } else {
                ranges.add(begin + "->" + nums[i]);
            }
        }
        return ranges;
    }
}
