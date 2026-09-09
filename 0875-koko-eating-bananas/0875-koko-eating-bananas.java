class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int i = 0 ; i < piles.length ; i++){
            max = Math.max(max,piles[i]);
        }
        while(min <= max){
            int mid = min+(max-min)/2;
            int i = 0;
            long h1 = 0;
            while(i< piles.length){
                double j =(double) piles[i]/mid;
                h1 += (int)Math.ceil(j);
                i++;
            }
            if(h1 <= h) max = mid-1;
            else min = mid + 1;
        }
        return min;
    }
}