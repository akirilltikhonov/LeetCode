package medium.RLEIterator;

public class RLEIterator {

    private final int[] encoding;
    private int index = 0;

    public RLEIterator(int[] encoding) {
        this.encoding = encoding;
    }

    public int next(int n) {
        if (index >= encoding.length) {
            encoding[index - 2] = 0;
            return -1;
        } else if (encoding[index] > n) {
            encoding[index] -= n;
            return encoding[index + 1];
        } else if (encoding[index] == n) {
            encoding[index] -= n;
            int ans = encoding[index + 1];
            index += 2;
            return ans;
        } else {
            int newN = n - encoding[index];
            encoding[index] = 0;
            index += 2;
            return next(newN);
        }
    }
}

/**
 * Your medium.RLEIterator object will be instantiated and called as such:
 * medium.RLEIterator obj = new medium.RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */