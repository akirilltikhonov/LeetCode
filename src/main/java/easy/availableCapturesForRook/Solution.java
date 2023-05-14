package easy.availableCapturesForRook;

public class Solution {

    private int ans = 0;

    public int numRookCaptures(char[][] board) {
        ans = 0;
        int[] rookXY = findCoordinateOfRook(board);
        if (rookXY != null) {
            checkRight(board, rookXY[0], rookXY[1]);
            checkLeft(board, rookXY[0], rookXY[1]);
            checkUp(board, rookXY[0], rookXY[1]);
            checkDown(board, rookXY[0], rookXY[1]);
        }
        return ans;
    }

    private int[] findCoordinateOfRook(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private void checkRight(char[][] board, int x, int y) {
        for (int j = y + 1; j < board[x].length; j++) {
            if (isFigure(board[x][j])) {
                break;
            }
        }
    }

    private void checkLeft(char[][] board, int x, int y) {
        for (int j = y - 1; j >= 0; j--) {
            if (isFigure(board[x][j])) {
                break;
            }
        }
    }

    private void checkUp(char[][] board, int x, int y) {
        for (int i = x - 1; i >= 0; i--) {
            if (isFigure(board[i][y])) {
                break;
            }
        }
    }

    private void checkDown(char[][] board, int x, int y) {
        for (int i = x + 1; i < board.length; i++) {
            if (isFigure(board[i][y])) {
                break;
            }
        }
    }

    private boolean isFigure(char cell) {
        if (cell == 'p') {
            ans++;
            return true;
        } else if (cell == 'B') {
            return true;
        }
        return false;
    }
}