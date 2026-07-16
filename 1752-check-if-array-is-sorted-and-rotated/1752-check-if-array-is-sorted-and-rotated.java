class Solution {
    public boolean check(int[] nums) {
        int dec = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i]>nums[i+1]){
                dec++;
                // int k = i % nums.length;
            }
        }
        if(dec == 0)return true;
        if(dec == 1 && (nums[nums.length-1] <= nums[0])) return true;
        return false;
    }
}