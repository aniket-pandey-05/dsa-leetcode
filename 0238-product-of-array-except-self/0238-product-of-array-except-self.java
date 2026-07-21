class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] rightarr = new int[nums.length];
        int curSum = 1;
        ans[0] = curSum;
        rightarr[nums.length-1] = curSum;
        for(int i = 1 ; i < nums.length ; i++){
            curSum *= nums[i-1];
            ans[i] = curSum;
        }
        int rightProd = 1;
        for(int j = nums.length-1 ; j >= 0 ; j--){
            ans[j] *= rightProd;
            rightProd *= nums[j];
        }
        return ans;
    }
}