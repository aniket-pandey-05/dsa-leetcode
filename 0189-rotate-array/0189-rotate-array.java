class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length != 1){
            int arr[] = new int[nums.length];
            k %= arr.length;
            for(int i = 0 ; i < nums.length ; i++){
                arr[k] = nums[i];
                k++;
                if(k >= arr.length) {
                    k %= arr.length;
                }
            }   
            for(int i = 0 ; i < nums.length ; i++){
                nums[i] = arr[i];
            }
        }
        
    }
}