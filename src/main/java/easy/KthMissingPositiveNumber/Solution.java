package easy.KthMissingPositiveNumber;

public class Solution {

    public int findKthPositive(int[] arr, int k) {
        int l = leftBinSearch(0, arr.length - 1, arr, k);

        if (l == 0 && k < arr[l]) {
            return k;
        } else if (isMissingIntMoreThanK(l, arr[l], k)) {
            int previous = l - 1;
            int missed = arr[previous] - (previous + 1);
            return arr[previous] + (k - missed);
        } else {
            int missed = arr[l] - (l + 1);
            return arr[l] + (k - missed);
        }
    }

    private int leftBinSearch(int l, int r, int[] arr, int k) {
        while (l < r) {
            int m = (r + l) / 2;
            if (isMissingIntMoreThanK(m, arr[m], k)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean isMissingIntMoreThanK(int idx, int num, int k) {
        return num - (idx + 1) >= k;
    }
}