class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevSum = 0;
        int curSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=1){  
                prevSum = Math.max(curSum,prevSum);
                curSum = 0;
            }
            curSum += nums[i];
        }
        return Math.max(curSum,prevSum);
    }
}