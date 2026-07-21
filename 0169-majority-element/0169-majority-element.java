class Solution {
    public int majorityElement(int[] nums) {
        int Element = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == Element) count++;
            else {
                count--;
                if(count == 0){
                    Element = nums[i];
                    count++;
                }
                
                
            }
        }
        return Element;
    }
}