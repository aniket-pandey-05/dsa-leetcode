class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = weights[0];
        int max = weights[0];
        for(int i = 1 ; i < weights.length ; i++){
            min = Math.max(min,weights[i]);
            max += weights[i];
        }
        
        while(min < max){
            int day = days;
            int sum = 0;
            int mid = min + (max - min)/2;
            for(int i = 0 ; i < weights.length ; i++){
                if (sum + weights[i] > mid) {
                    day--;
                    sum = 0;
                }
                sum += weights[i];
            }
            if(day > 0) max = mid;
            else min = mid+1;
        }
        return max;
    }
}