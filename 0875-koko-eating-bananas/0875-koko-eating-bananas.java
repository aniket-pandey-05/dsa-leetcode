class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int min = 1;
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        while (min <= max) {

            int mid = min + (max - min) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // mid is fast enough, try a smaller speed
                max = mid - 1;
            } else {
                // mid is too slow
                min = mid + 1;
            }
        }

        return min;
    }
}