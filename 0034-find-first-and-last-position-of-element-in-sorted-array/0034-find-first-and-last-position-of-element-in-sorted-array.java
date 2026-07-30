class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1 , -1};
        int start = 0 ;int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2 ; 
            if(nums[mid] == target){
                if(mid > 0 && nums[mid-1] == target){
                    end = mid-1;
                    continue;
                }
                arr[0] = mid;
                break;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        start = 0 ;end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2 ; 
            if(nums[mid] == target){
                if(mid < nums.length-1 && nums[mid+1] == target){
                    start = mid+1;
                    continue;
                }
                arr[1] = mid ;
                break;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr;
    }
}