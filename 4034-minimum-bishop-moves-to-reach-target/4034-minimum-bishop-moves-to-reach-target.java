class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sRow = source[0];
        int sCol = source[1];

        int tRow = target[0];
        int tCol = target[1];

        if (sRow == tRow && sCol == tCol) {
            return 0;
        }

        if ((sRow + sCol) % 2 != (tRow + tCol) % 2) {
            return -1;
        }

        if (Math.abs(sRow - tRow) == Math.abs(sCol - tCol)) {
            return 1;
        }
        return 2;
    }
}