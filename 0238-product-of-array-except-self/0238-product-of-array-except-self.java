class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftarr = new int[nums.length];
        int[] rightarr = new int[nums.length];
        int curSum = 1;
        leftarr[0] = curSum;
        rightarr[nums.length-1] = curSum;
        for(int i = 1 ; i < nums.length ; i++){
            curSum *= nums[i-1];
            leftarr[i] = curSum;
        }
        curSum = 1;
        for(int j = nums.length-2 ; j >= 0 ; j--){
            curSum *= nums[j+1];
            rightarr[j] = curSum;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = leftarr[i]*rightarr[i];
        }
        return nums;
    }
}