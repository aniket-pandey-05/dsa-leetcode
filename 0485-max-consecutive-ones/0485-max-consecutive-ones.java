class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevSum = 0;
        int curSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=1){
                if(curSum >= prevSum){
                    prevSum = curSum;
                }
                curSum = 0;
            }
            curSum += nums[i];
        }
        if(curSum >= prevSum) return curSum;
        return prevSum;
    }
}