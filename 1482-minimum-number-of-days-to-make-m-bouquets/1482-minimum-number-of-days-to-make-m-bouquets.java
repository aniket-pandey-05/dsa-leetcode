class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }

        while (min <= max) {

            int mid = min + (max - min) / 2;

            boolean res = bloom(bloomDay, k, m, mid);

            if (res) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }

    public boolean bloom(int[] bloomDay, int k, int m, int mid) {

        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {

                count++;

                if (count == k) {
                    m--;
                    count = 0;

                    if (m == 0) return true;
                }

            } else {
                count = 0;
            }
        }

        return m == 0;
    }
}