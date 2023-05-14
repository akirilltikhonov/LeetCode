package easy.mergeSortedArray;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (p1 >= 0 && (p2 < 0 || nums1[p1] >= nums2[p2])) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = 0;
//        int p2 = 0;
//        int[] res = new int[m + n];
//        for (int i = 0; i < m + n; i++) {
//            if (p1 < m && (p2 >= n || nums1[p1] <= nums2[p2])) {
//                res[i] = nums1[p1];
//                p1++;
//            } else {
//                res[i] = nums2[p2];
//                p2++;
//            }
//        }
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = res[i];
//        }
//    }
}
