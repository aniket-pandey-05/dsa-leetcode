class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1 , -1};
        int start = 0 ;
        int end = nums.length-1;
        arr[0] = lowerBound(nums, target , start , end);
        arr[1] = upperBound(nums, target , start , end);
        return arr;
    }
    public int lowerBound(int[] nums, int target , int start , int end){
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if(target <= nums[mid]) end = mid-1;
            else start = mid+1;
        }
        if(start < nums.length && nums[start] == target) return start;
        return -1;
    }
    public int upperBound(int[] nums, int target , int start , int end){
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if(target >= nums[mid]) start = mid+1;
            else end = mid-1;
        }
        if(end > -1 && nums[end] == target) return end;
        return -1;
    }
}