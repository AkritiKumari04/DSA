class Solution {
    public int totalNQueens(int n) {
        return solve(0, n, 0, 0, 0);
    }

    private int solve(int row, int n, int cols, int diagonals1, int diagonals2) {
        // All queens have been placed
        if (row == n) {
            return 1;
        }

        int count = 0;

        // Find columns where we can place a queen
        int available = ((1 << n) - 1) & ~(cols | diagonals1 | diagonals2);

        while (available != 0) {

            // Pick one available position
            int position = available & -available;

            // Remove it from available positions
            available -= position;

            count += solve(
                row + 1,
                n,
                cols | position,
                (diagonals1 | position) << 1,
                (diagonals2 | position) >> 1
            );
        }

        return count;
    }
}