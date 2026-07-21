class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftarr = new int[nums.length];
        int[] rightarr = new int[nums.length];
        int curSum = 1;
        leftarr[0] = curSum;
        rightarr[nums.length-1] = curSum;
        int prevSum;
        for(int i = 1 ; i < nums.length ; i++){
            prevSum = nums[i-1];
            curSum *= prevSum;
            leftarr[i] = curSum;
        }
        curSum = 1;
        for(int j = nums.length-2 ; j >= 0 ; j--){
            prevSum = nums[j+1];
            curSum *= prevSum;
            rightarr[j] = curSum;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = leftarr[i]*rightarr[i];
        }
        return nums;
    }
}